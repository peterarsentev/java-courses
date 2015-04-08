package ru.lessons.lesson_13.console;

import ru.lessons.lesson_13.Cell;

import java.io.PrintStream;

/**
 * TODO: comment
 * @author parsentev
 * @since 08.04.2015
 */
public class ConsoleCell implements Cell<PrintStream> {
	private boolean bomb;
	private boolean suggestBorm = false;
	private boolean empty = false;

	public ConsoleCell(boolean bomb) {
		this.bomb = bomb;
	}

	@Override
	public boolean isBomb() {
		return this.bomb;
	}

	@Override
	public boolean isSuggestBomb() {
		return this.suggestBorm;
	}

	@Override
	public boolean isEmpty() {
		return this.empty;
	}

	@Override
	public void suggectEmpty() {
		this.empty = true;
	}

	@Override
	public void suggectBomb() {
		this.suggestBorm = true;
	}

	@Override
	public void draw(PrintStream paint, boolean real) {
		if (real) {
			if (this.isBomb()) {
				paint.print("[*] ");
			} else {
				paint.print("[ ] ");
			}
		} else {
			if (this.suggestBorm) {
				paint.print("[?] ");
			} else if (this.empty) {
				paint.print("[ ] ");
			} else {
				paint.print("[Х] ");
			}
		}
	}
}
