package ru.parsentev.store;

import org.junit.Test;
import ru.parsentev.models.User;

import static org.junit.Assert.*;

/**
 * TODO: comment
 * @author parsentev
 * @since 01.05.2015
 */
public class HibernateStorageTest {
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
}