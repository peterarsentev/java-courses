package ru.parsentev.store;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNotNull;

/**
 * TODO: comment
 * @author parsentev
 * @since 24.05.2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
@WebAppConfiguration
public class StorageTest {

	@Autowired
	private UserStorage storage;

	@Test
	public void initStorage() {
		assertNotNull(storage);
	}
}
