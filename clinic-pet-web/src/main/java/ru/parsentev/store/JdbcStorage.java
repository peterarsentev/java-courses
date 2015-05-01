package ru.parsentev.store;


import ru.parsentev.models.User;
import ru.parsentev.service.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 29.04.2015
 */
public class JdbcStorage implements Storage {
	private final Connection connection;

	public JdbcStorage() {
		final Settings settings = Settings.getInstance();
		try {
			this.connection = DriverManager.getConnection(settings.value("jdbc.url"), settings.value("jdbc.username"), settings.value("jdbc.password"));
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	@Override
	public Collection<User> values() {
		final List<User> users = new ArrayList<>();
		try (final Statement statement = this.connection.createStatement();
		     final ResultSet rs = statement.executeQuery("select * from client")) {
			while (rs.next()) {
				users.add(new User(rs.getInt("uid"), rs.getString("name"), null));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public int add(User user) {
		try (final PreparedStatement statement = this.connection.prepareStatement("insert into client (name) values (?)", Statement.RETURN_GENERATED_KEYS)) {
			statement.setString(1, user.getLogin());
			statement.executeUpdate();
			try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					return generatedKeys.getInt(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		throw new IllegalStateException("Could not create new user");
	}

	@Override
	public void edit(User user) {

	}

	@Override
	public void delete(int id) {

	}

	@Override
	public User get(int id) {
		try (final PreparedStatement statement = this.connection.prepareStatement("select * from client where uid=(?)")) {
			statement.setInt(1, id);
			try (final ResultSet rs = statement.executeQuery()) {
				while (rs.next()) {
					return new User(rs.getInt("uid"), rs.getString("name"), null);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		throw new IllegalStateException(String.format("User %s does not exists", id));
	}

	@Override
	public User findByLogin(String login) {
		return null;
	}

	@Override
	public int generateId() {
		return 0;
	}

	@Override
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
