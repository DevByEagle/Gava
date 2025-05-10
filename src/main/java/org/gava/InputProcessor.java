package org.gava;

import java.awt.event.KeyEvent;

public class InputProcessor implements Input {
	private static final InputProcessor instance = new InputProcessor();
	private final boolean[] keys = new boolean[256];
	private final boolean[] prevKeys = new boolean[256];

	private InputProcessor() {}

	public static InputProcessor getInstance() {
		return instance;
	}

	public void update() {
		System.arraycopy(keys, 0, prevKeys, 0, keys.length);
	}

	@Override
	public boolean isKeyPressed(int key) {
		return keys[key] && !prevKeys[key];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() < keys.length)
			keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() < keys.length)
			keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {}
}
