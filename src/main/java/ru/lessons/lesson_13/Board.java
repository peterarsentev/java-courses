package ru.lessons.lesson_13;

/**
 * TODO: comment
 * @author parsentev
 * @since 08.04.2015
 */
public interface Board {

	void drawBoard(Cell[][] cells);

	void drawCell(int x, int y);

	void drawBang();

	void congratulate();
}
