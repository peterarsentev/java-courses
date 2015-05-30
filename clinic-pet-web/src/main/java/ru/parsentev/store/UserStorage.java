package ru.parsentev.store;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import ru.parsentev.models.User;

import java.util.Collection;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 01.05.2015
 */
@Repository
public class UserStorage implements Storage<User> {
	private final SessionFactory factory;

	public UserStorage() {
		factory = new Configuration().configure().buildSessionFactory();
	}

	public interface Command<T> {
		T process(Session session);
	}

	private <T> T transaction(final Command<T> command) {
		final Session session = factory.openSession();
		final Transaction tx = session.beginTransaction();
		try {
			return command.process(session);
		} finally {
			tx.commit();
			session.close();
		}
	}

	@Override
	public Collection<User> values() {
		return transaction((Session session) -> session.createQuery("from User").list());
	}

	@Override
	public int add(final User user) {
		return transaction(
				(Session session) -> {
					session.save(user);
					return user.getId();
				}
		);
	}

	@Override
	public void edit(final User user) {
		transaction(
				(Session session) -> {
					session.update(user);
					return null;
				}
		);
	}

	@Override
	public void delete(final int id) {
		transaction(new Command() {
			@Override
			public Object process(Session session) {
				session.delete(get(id));
				return null;
			}
		});
	}

	@Override
	public User get(final int id) {
		return transaction(new Command<User>() {
			@Override
			public User process(Session session) {
				return (User) session.get(User.class, id);
			}
		});
	}

	@Override
	public User findByLogin(final String login) {
		return transaction(new Command<User>() {
			@Override
			public User process(Session session) {
				final Query query = session.createQuery("from User as user where user.login=:login");
				query.setString("login", login);
				return (User) query.iterate().next();
			}
		});
	}

	public List<User> findByRoleName(final String roleName) {
		return transaction(new Command<List<User>>() {
			@Override
			public List<User> process(Session session) {
				final Query query = session.createQuery("from User as user inner join user.role as role on role.name=:name");
				query.setString("name", roleName);
				return query.list();
			}
		});
	}

	public List<User> searchByLogin(final String login) {
		return transaction(new Command<List<User>>() {
			@Override
			public List<User> process(Session session) {
				final Query query = session.createQuery("from User as user where lower(user.login) like %:login%");
				query.setString("login", login);
				return query.list();
			}
		});
	}

	public User findByAuth(final String login, final String password) {
		return transaction(new Command<User>() {
			@Override
			public User process(Session session) {
				final Query query = session.createQuery("from User as user where user.login=:login and user.password=:password");
				query.setString("login", login);
				query.setString("password", password);
				List<User> users = query.list();
				return users.isEmpty() ? null : users.iterator().next();
			}
		});
	}

	@Override
	public int generateId() {
		return 0;
	}

	@Override
	public void close() {
		this.factory.close();
	}
}
