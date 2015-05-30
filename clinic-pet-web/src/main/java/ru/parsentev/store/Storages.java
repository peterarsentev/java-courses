package ru.parsentev.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.05.2015
 */
@Service
public class Storages {
	public final UserStorage userStorage;

	public final RoleStorage roleStorage;

	public final MessageStorage messageStorage;

	@Autowired
	public Storages(final UserStorage userStorage, final RoleStorage roleStorage, final MessageStorage messageStorage) {
		this.userStorage = userStorage;
		this.roleStorage = roleStorage;
		this.messageStorage = messageStorage;
	}
}
