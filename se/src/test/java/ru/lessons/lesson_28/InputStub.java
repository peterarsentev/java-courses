package ru.lessons.lesson_28;

import java.util.Iterator;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 01.10.2015
 */
public final class InputStub implements Input {
	private final Iterator<String> answers;

	public InputStub(Iterator<String> answers) {
		this.answers = answers;
	}

	public String next() {
		return this.answers.next();
	}

	public void close() {
	}
}
