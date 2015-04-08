package ru.lessons.lesson_13.gui;

import ru.lessons.lesson_13.BaseAction;
import ru.lessons.lesson_13.Board;
import ru.lessons.lesson_13.GeneratorBoard;
import ru.lessons.lesson_13.SaperLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * TODO: comment
 * @author parsentev
 * @since 08.04.2015
 */
public class GUIAction extends BaseAction implements ActionListener, MouseListener {
	private GUIBoard board;

	public GUIAction(SaperLogic logic, GUIBoard board, GeneratorBoard generator) {
		super(logic, board, generator);
		this.board = board;
		this.board.addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.initGame();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		board.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}
