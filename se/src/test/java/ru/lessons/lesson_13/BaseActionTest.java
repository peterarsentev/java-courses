package ru.lessons.lesson_13;

import org.junit.Test;
import ru.lessons.lesson_13.console.ConsoleBoard;
import ru.lessons.lesson_13.console.ConsoleCell;
import ru.lessons.lesson_13.logics.Easy;

import static org.junit.Assert.*;

public class BaseActionTest {

	final BaseAction action = new BaseAction(
			new Easy(), new ConsoleBoard(),
			new GeneratorBoard() {
				@Override
				public Cell[][] generate() {
					return new Cell[][] {
							{new ConsoleCell(true), new ConsoleCell(false)},
							{new ConsoleCell(true), new ConsoleCell(false)}};
				}
			}
	);

	@Test
	public void successGame() {
		action.initGame();
		action.select(0, 0, true);
		action.select(1, 0, true);
		action.select(0, 1, false);
		action.select(1, 1, false);
	}

	@Test
	public void failureGame() {
		action.initGame();
		action.select(0, 0, true);
		action.select(1, 0, false);
	}
}