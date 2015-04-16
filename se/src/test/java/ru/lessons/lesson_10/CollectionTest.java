package ru.lessons.lesson_10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class CollectionTest {
	@Test
	public void arrayContains() {
		List<User> users = new ArrayList<User>();
		users.add(new User("1", "first"));
		users.add(new User("2", "second"));

		assertTrue(users.contains(new User("1", "first")));
	}

	/**
	 * Зависимость {@link java.util.Set#add} от методов hashCode equals
	 */
	@Test
	public void setAdd() {
		Set<User> users = new HashSet<User>();
		users.add(new User("1", "first"));
		users.add(new User("2", "second"));

		assertEquals(2, users.size());
	}

	/**
	 * Зависимость {@link java.util.Map#put} от методов hashCode equals
	 */
	@Test
	public void mapPut() {
		Map<User, User> users = new HashMap<User, User>();
		users.put(new User("1", "first"), new User("1", "first"));
		users.put(new User("2", "second"), new User("2", "second"));
		users.put(new User("1", "first"), new User("3", "first"));

		assertEquals(2, users.size());
	}
}