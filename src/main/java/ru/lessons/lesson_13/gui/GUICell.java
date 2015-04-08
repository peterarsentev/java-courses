package ru.lessons.lesson_13.gui;

import ru.lessons.lesson_13.Cell;

import java.awt.*;

/**
 * TODO: comment
 * @author parsentev
 * @since 08.04.2015
 */
public class GUICell implements Cell<Graphics> {

	@Override
	public boolean isBomb() {
		return false;
	}

	@Override
	public boolean isSuggestBomb() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void suggectEmpty() {

	}

	@Override
	public void suggectBomb() {

	}

	@Override
	public void draw(Graphics paint, boolean real) {
//		paint.drawLine();
	}
}
