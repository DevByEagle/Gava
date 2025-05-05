package com.devbyeagle.gava;

import javax.swing.JFrame;

public class Game {
	private JFrame window;
	private boolean running = false;
	
	public Game(int width, int height, String title) {
		if (title == null || title == "") title = "Gava";
		
		window = new JFrame(title);
		window.setSize(width, height);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void exit() {
		running = false;
		window.dispose();
	}
	
	public void run() {
		running = true;
		
		if (running) {
			window.setVisible(true);
		} else {
			exit();
			return;
		}
	}
}