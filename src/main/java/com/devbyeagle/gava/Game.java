package com.devbyeagle.gava;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.awt.*;
import java.util.*;

public class Game {
	private JFrame window;
	private boolean running = false;
	private static final Set<Integer> keysPressed = new HashSet<>();
	
	static {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
			public boolean dispatchKeyEvent(KeyEvent e) {
				synchronized (InputStream.class) {
					switch (e.getID()) {
						case KeyEvent.KEY_PRESSED -> keysPressed.add(e.getKeyCode());
						case KeyEvent.KEY_RELEASED -> keysPressed.remove(e.getKeyCode());
					}
				}
				return false;
			}
		});
	}
	
	public Game(int width, int height, String title) {
		if (title == null || title == "") title = "Gava";
		
		window = new JFrame(title);
		window.setSize(width, height);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public boolean isKeyPreesed(int key) {
		return keysPressed.contains(key);
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