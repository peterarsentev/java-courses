package ru.lessons.lesson_4;

import ru.lessons.lesson_28.Action;
import ru.lessons.lesson_8.UserException;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс реализует калькулятор.
 */
public class Calculator {
	/**
	 Результат вычисления.
	 */
	private int result;

	private final Map<String, Action> operation = new HashMap<String, Action>();

	public Calculator() {
		this.load(new Add());
		this.load(new Div());
	}

	public void load(Action action) {
		this.operation.put(action.operation(), action);
	}

	public void calculate(int first, int second, String operation) {
		this.result = this.operation.get(operation).arithmetical(first, second);
	}


	public static final class Add implements Action {

		public String operation() {
			return "+";
		}

		public int arithmetical(int first, int second) {
			return first + second;
		}
	}

	public static final class Div implements Action {

		public String operation() {
			return "/";
		}

		public int arithmetical(int first, int second) {
			if (second != 0) {
				return first / second;
			} else {
				throw new ArithmeticException();
			}
		}
	}

	/**
	 * Суммируем аргументы.
	 * @param params Аргументы суммирования.
	 */
	public void add(int ... params) {
		for (int param : params) {
			this.result += param;
		}
	}

	/**
	 * Вычиляем деление.
	 * @param args входящие агрументы.
	 * @throws ru.lessons.lesson_8.UserException Если агрументов нет, выкидывает исключение.
	 */
	public void div(int ... args) throws UserException {
		if (args.length > 0) {
			this.result = args[0];
			for (int params : args) {
				if (params == 0) {
					throw new IllegalArgumentException("You try to div by 0. Please change arg!");
				}
				this.result /= params;
			}
		} else {
			throw new UserException("You should enter args!");
		}
	}

	/**
	 * Получить результат.
	 * @return результат вычисления.
	 */
	public int getResult() {
		return this.result;
	}

	/**
	 * Очистить результат вычисления.
	 */
	public void cleanResult() {
		this.result = 0;
	}
}