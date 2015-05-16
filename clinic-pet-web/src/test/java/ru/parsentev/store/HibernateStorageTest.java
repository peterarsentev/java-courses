package ru.parsentev.store;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.models.Message;
import ru.parsentev.models.Role;
import ru.parsentev.models.User;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * TODO: comment
 * @author parsentev
 * @since 01.05.2015
 */
public class HibernateStorageTest {

	@Ignore
	@Test
	public void testCreate() throws Exception {
		final HibernateStorage storage = new HibernateStorage();
		final int id = storage.add(new User(-1, "hibenate", null));
		final User user = storage.get(id);
		assertEquals(id, user.getId());
		assertEquals(id, storage.findByLogin("hibenate").getId());
		storage.delete(id);
		assertNull(storage.get(id));
		storage.close();
	}

	@Test
	public void testCreateUser() throws Exception {
		final HibernateStorage storage = new HibernateStorage();
		Role role = new Role();
		role.setName("admin");
		User user = new User();
		user.setLogin("test");
		user.setEmail("test@test");
		user.setRole(role);
		final int id = storage.add(user);
		user = storage.get(id);
		Message message = new Message();
		message.setUser(user);
		message.setText("text");
		HashSet<Message> messages = new HashSet<Message>();
		messages.add(message);
		user.setMessages(messages);
		storage.edit(user);
		assertEquals(1, storage.get(id).getMessages().size());
		storage.delete(id);
		storage.close();
	}
}