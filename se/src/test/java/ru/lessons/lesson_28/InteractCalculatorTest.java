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
		//assign
		final Output out = new OutputStub();
		final Input input = new InputStub(Arrays.asList("1", "+", "1", "no", "yes").iterator(), out);
		final Calculator calc = new Calculator();
		final InteractCalculator interact = new InteractCalculator(input, out, calc);
		//action
		interact.action();
		input.close();
		//assert
		assertThat(calc.getResult(), is(2));
	}
}