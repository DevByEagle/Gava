package org.gava;

import java.awt.Graphics;

import javax.swing.JFrame;

import org.gava.utils.Disposable;

public abstract class Game implements Disposable {
	private final JFrame frame;
	private boolean running = false;
	private int fps = 60;
	
	public Game() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.addKeyListener(InputProcessor.getInstance());
	}
	
	public void dispose() {
		if (!running) return;
		running = true;
	}
	
	/** The main loop. Handles updating and rendering. */
	public final void run() {
		start();
		
		final double drawInterval = 1000000000 / fps;
		double delta = 0;
        long lastTime = System.nanoTime();
        
        while (running) {
        	long currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;
            
            if (delta >= 1) {
            	update();
            	InputProcessor.getInstance().update();
            	delta--;
            }
            
            render();
        }
        dispose();
	}
	
	private void start() {
		if (running) return;
		running = true;
	}
	
	private void render() {
		if (frame.getBufferStrategy() == null) {
			frame.createBufferStrategy(3);
			return;
		}
		
		var g = frame.getBufferStrategy().getDrawGraphics();
		draw(g);
		g.dispose();
		frame.getBufferStrategy().show();
	}
	
	public abstract void draw(Graphics g);
	
	/** Called once every frame to update the game logic. */
	public abstract void update();
}