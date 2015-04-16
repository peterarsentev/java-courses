package ru.lessons.lesson_12;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO: comment
 * @author parsentev
 * @since 09.04.2015
 */
public class Counter {
	private AtomicInteger amount = new AtomicInteger(0);

	public int increase() {
		return amount.incrementAndGet();
	}
}
