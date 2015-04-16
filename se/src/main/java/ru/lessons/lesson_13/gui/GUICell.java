package ru.lessons.lesson_13.gui;

import ru.lessons.lesson_13.Cell;

import java.awt.*;

/**
 * TODO: comment
 * @author parsentev
 * @since 08.04.2015
 */
public class GUICell implements Cell<Graphics> {

	public boolean isBomb() {
		return false;
	}

	public boolean isSuggestBomb() {
		return false;
	}

	public boolean isSuggestEmpty() {
		return false;
	}

	public void suggectEmpty() {
	}

	public void suggectBomb() {
	}

	public void draw(Graphics paint, boolean real) {

	}
}
