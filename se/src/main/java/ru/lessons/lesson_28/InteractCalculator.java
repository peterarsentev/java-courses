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
		try {
			String exit = "no";
			while (!exit.equals("yes")) {
				output.println("Enter first arg : ");
				String first = input.next();
				output.println("Enter second arg : ");
				String second = input.next();
				try {
					calculator.div(Integer.valueOf(first), Integer.valueOf(second));
				} catch (UserException e) {
					output.println(e.getMessage());
					output.println("Please enter two args.");
				}

				output.println("Result : " + calculator.getResult());
				calculator.cleanResult();
				output.println("Exit : yes/no ");
				exit = input.next();
			}
		} finally {
			input.close();
		}
	}
}
