package ru.lessons.lesson_28;

import ru.lessons.lesson_4.Calculator;
import ru.lessons.lesson_8.UserException;

/**
 * TODO: comment
 * @author parsentev
 * @since 01.10.2015
 */
public class InteractCalculator {
	private final Input input;
	private final Output output;
	private final Calculator calculator;

	public InteractCalculator(Input input, Output output, Calculator calculator) {
		this.input = input;
		this.output = output;
		this.calculator = calculator;
	}

	public void action() {
		do {
			String first = input.ask("Enter first arg : ");
			String operation = input.ask("Enter operation : ");
			String second = input.ask("Enter second arg : ");
			this.calculator.calculate(Integer.valueOf(first), Integer.valueOf(second), operation);
			output.println(String.format("Result : %s", calculator.getResult()));
			if ("yes".equals(input.ask("Do you want to clean the result?"))) {
				calculator.cleanResult();
			}
		} while ("no".equals(input.ask("Exit : yes/no ")));
	}
}
