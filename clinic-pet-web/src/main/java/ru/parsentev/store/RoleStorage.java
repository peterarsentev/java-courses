package ru.parsentev.store;

import org.springframework.stereotype.Repository;
import ru.parsentev.models.Role;

import java.util.Collection;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.05.2015
 */
@Repository
public class RoleStorage implements Storage<Role> {

	@Override
	public Collection<Role> values() {
		return null;
	}

	@Override
	public int add(Role user) {
		return 0;
	}

	@Override
	public void edit(Role user) {

	}

	@Override
	public void delete(int id) {

	}

	@Override
	public Role get(int id) {
		return null;
	}

	@Override
	public Role findByLogin(String login) {
		return null;
	}

	@Override
	public int generateId() {
		return 0;
	}

	@Override
	public void close() {

	}
}
