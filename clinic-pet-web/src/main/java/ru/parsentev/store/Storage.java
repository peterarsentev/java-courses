package ru.parsentev.store;

import org.springframework.transaction.annotation.Transactional;
import ru.parsentev.models.User;

import java.util.Collection;

/**
 * TODO: comment
 * @author parsentev
 * @since 29.04.2015
 */
public interface Storage<T> {

	public Collection<T> values();

	public int add(final T user);

	public void edit(final T user);

	public void delete(final int id);

	public T get(final int id);

	public T findByLogin(final String login) ;

	public int generateId();

	public void close();
}
