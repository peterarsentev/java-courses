package ru.lessons.lesson_28;

/**
 * TODO: comment
 * @author parsentev
 * @since 01.10.2015
 */
public interface Input {
	String next();

	String ask(String question);

	void close();
}
