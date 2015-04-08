package ru.lessons.lesson_13;

/**
 * TODO: comment
 * @author parsentev
 * @since 08.04.2015
 */
public interface Cell<T> {

	boolean isBomb();

	boolean isSuggestBomb();

	boolean isEmpty();

	void suggectEmpty();

	void suggectBomb();

	void draw(T paint, boolean real);
}
