package ru.parsentev.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.parsentev.store.Storages;
import ru.parsentev.store.UserStorage;
import ru.parsentev.store.Storage;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.05.2015
 */
public class DbTool {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		Storages storage = context.getBean(Storages.class);
		storage.userStorage.values();
	}
}
