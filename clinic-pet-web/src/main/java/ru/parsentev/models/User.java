package ru.parsentev.models;

/**
 * TODO: comment
 * @author parsentev
 * @since 17.04.2015
 */
public class User {
	private int id;
	private String login;
	private String email;

	public User() {
	}

	public User(final int id, final String login, final String email) {
		this.id = id;
		this.login = login;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getLogin() {
		return this.login;
	}

	public String getEmail() {
		return this.email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
