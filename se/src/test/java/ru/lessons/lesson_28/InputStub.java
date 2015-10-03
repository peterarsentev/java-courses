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
	private final Output output;

	public InputStub(Iterator<String> answers, Output output) {
		this.answers = answers;
		this.output = output;
	}

	public String next() {
		return this.answers.next();
	}

	public String ask(String question) {
		this.output.println(question);
		return this.answers.next();
	}

	public void close() {
	}
}
