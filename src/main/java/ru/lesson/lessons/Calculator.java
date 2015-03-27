package ru.lesson.lessons;

/**
 * Класс реализует калькулятор.
 */
public class Calculator {
	/**
	 Результат вычисления.
	 */
	private int result;

	/**
	 * Суммируем аргументы.
	 * @param params Аргументы суммирования.
	 */
	public void add(int ... params) {
		for (int param : params) {
			this.result += param;
		}
	}

	public void div(int ... args) {
		if (args.length > 0) {

		} else {

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