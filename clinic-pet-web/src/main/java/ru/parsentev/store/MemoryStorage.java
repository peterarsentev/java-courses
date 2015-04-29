package ru.parsentev.store;

import ru.parsentev.models.User;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO: comment
 * @author parsentev
 * @since 29.04.2015
 */
public class MemoryStorage implements Storage {

	private final AtomicInteger ids = new AtomicInteger();

	private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<Integer, User>();


	@Override
	public Collection<User> values() {
		return this.users.values();
	}

	@Override
	public int add(final User user) {
		this.users.put(user.getId(), user);
		return user.getId();
	}

	@Override
	public void edit(final User user) {
		this.users.replace(user.getId(), user);
	}

	@Override
	public void delete(final int id) {
		this.users.remove(id);
	}

	@Override
	public User get(final int id) {
		return this.users.get(id);
	}

	@Override
	public User findByLogin(final String login) {
		for (final User user : users.values()) {
			if (user.getLogin().equals(login)) {
				return user;
			}
		}
		throw new IllegalStateException(String.format("Login %s not found", login));
	}

	@Override
	public int generateId() {
		return this.ids.incrementAndGet();
	}

	@Override
	public void close() {
	}
}
