package ru.lessons.lesson_6;

/**
 * TODO: comment
 * @author parsentev
 * @since 16.04.2015
 */
public class Dog implements Pet {
	private final Animal animal;

	public Dog(Animal animal) {
		this.animal = animal;
	}

	public String getName() {
		return this.animal.getName();
	}
}
