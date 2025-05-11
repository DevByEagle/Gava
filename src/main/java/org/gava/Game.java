package org.gava;

import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

import org.gava.utils.Disposable;

public abstract class Game implements Graphics, Disposable {
	
	//=== Fields ===//
	private final JFrame frame;
	private final GameTime gameTime = new GameTime();
	private boolean running = false;

	//=== Constructors ===//
	public Game() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	//=== Game Loop ===//
	/** The main loop. Handles updating and rendering. */
	public final void run() {
		start();
		float delta = 0;

		while (running) {
			gameTime.updateTime();
			delta += getRawDeltaTime();

			while (delta >= 1) {
				update();
				delta--;
			}
		}
		dispose();
	}

	// private void render() {}

	//=== Lifecycle Methods ===//
	private void start() {
		if (running) return;
		running = true;
	}

	@Override
	public void dispose() {
		if (!running) return;
		running = false;
	}

	//=== Utility ===//
	@Override
	public final float getRawDeltaTime() {
		return gameTime.deltaTime;
	}

	//=== Abstract Methods ===//
	/** Called once every frame to update the game logic. */
	public abstract void update();
}