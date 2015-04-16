package ru.lessons.lesson_6;

/**
 * TODO: comment
 * @author parsentev
 * @since 07.04.2015
 */
public class Animal implements Pet {
	private final String name;

	public Animal(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
