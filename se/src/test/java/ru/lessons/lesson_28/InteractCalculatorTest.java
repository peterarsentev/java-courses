package ru.lessons.lesson_28;

import org.junit.Test;
import ru.lessons.lesson_4.Calculator;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 * @author parsentev
 * @since 01.10.2015
 */
public class InteractCalculatorTest {

	@Test
	public void testAction() throws Exception {
		final Calculator calc = new Calculator();
		final InteractCalculator interact = new InteractCalculator(
				new InputStub(Arrays.asList("1", "1", "yes").iterator()),
				new OutputStub(),
				calc
		);
		interact.action();
		assertThat(calc.getResult(), is(2));
	}
}