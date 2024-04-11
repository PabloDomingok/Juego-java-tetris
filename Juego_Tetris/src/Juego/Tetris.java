package Juego;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame{
	
	private JLabel statusbar;
	
	public Tetris() {
		
		initUI();
	}
	
	private void initUI() {
		statusbar = new JLabel(" 0");
		add(statusbar, BorderLayout.SOUTH);
		
		var Board = new Board(this);
		add(Board);
		board.start();
		
		setTitle("Tetris");
		setSize(200,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
	}
	
	JLabel getStatusBar() {
		return statusbar;
	}
	
	
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(()->{
			
			var game =new Tetris();
			game.setVisible(true);
			
		});
		
	}

}
