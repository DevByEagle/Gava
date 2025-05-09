package org.gava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public abstract class Game implements Runnable {
	private JFrame frame;
	private Thread gameThread;
	private boolean running = false;
	private int fps = 60;
	
	/** Creates a game window with default dimensions and title. */
	public Game() {
		this(800, 600, "Gava");
	}
	
	public Game(int width, int height, String title) {
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
	
	/** The main loop. Handles updating and rendering. */
	public final void run() {
		start();
		final double nsPerUpdate = 1000000000.0 / fps;
		long lastTime = System.nanoTime();
		double delta = 0;
		
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / nsPerUpdate;
			lastTime = now;
			
			while (delta >= 1) {
				update();
				delta--;
			}
			
			render();
		}
		stop();
	}
	
	private void render() {
		BufferStrategy bs = frame.getBufferStrategy();
		if (bs == null) {
			frame.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		draw(g);
		g.dispose();
		bs.show();
	}
	
	/** Called once every frame to update the game logic. */
	protected abstract void update();
	
	/**
	 * Called once every frame to render graphics.
	 * 
	 * @param g Graphics context
	 */
	protected abstract void draw(Graphics g);
	
	private synchronized void start() {
		if (running) return;
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	private synchronized void stop() {
		if (!running) return;
		running = false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}