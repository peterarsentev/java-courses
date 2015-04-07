package ru.lessons.lesson_10;


import java.util.HashMap;
import java.util.Map;

/**
 * TODO: comment
 * @author parsentev
 * @since 06.04.2015
 */
public class UserRunner {
	public static void main(String[] args) {
		Map<String, User> users = new HashMap<String, User>();
		users.put("1", new User("1", "first"));
		users.put("2", new User("2", "two"));
		users.put("1", new User("1", "first"));

		for (Map.Entry<String, User> user : users.entrySet()) {
			System.out.println(user);
		}
	}
}