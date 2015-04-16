package ru.lessons.lesson_10;


/**
 * TODO: comment
 * @author parsentev
 * @since 06.04.2015
 */
public class User {
	private String id;
	private String name;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		User user = (User) o;

		if (id != null ? !id.equals(user.id) : user.id != null) {
			return false;
		}
		if (name != null ? !name.equals(user.name) : user.name != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "User{" +
		       "id='" + id + '\'' +
		       ", name='" + name + '\'' +
		       '}';
	}
}
