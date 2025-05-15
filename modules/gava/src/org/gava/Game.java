package org.gava;

import java.awt.*;

import javax.swing.JFrame;

import org.gava.utils.Disposable;

public abstract class Game implements Disposable, Runnable {
    private JFrame frame;
    private Thread gameThread;
    private boolean running = false;
    private int fps;
    
    private final int TARGET_FPS = 60;
    private final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;

    public Game() {
        this(800, 600, "Gava");
    }

    public Game(int width, int height, String title) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void dispose() {
        if (!running) return;
        running = false;

        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** The main loop. Handles updating and rendering. */
    public final void run() {
        start();
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        int frames = 0, updates = 0;

        while (running) {
            long now = System.nanoTime();
            double delta = (now - lastTime) / 1_000_000_000.0;
            lastTime = now;

            update(delta);
            updates++;

            render();
            frames++;

            long wait = (lastTime - System.nanoTime() + OPTIMAL_TIME) / 1_000_000;
            if (wait > 0) try { Thread.sleep(wait); } catch (Exception ignored) {}

            if (System.currentTimeMillis() - timer > 1000) {
                fps = frames;
                System.out.println("FPS: " + fps);
                frames = 0; updates = 0;
                timer += 1000;
            }
        }
    }

    private void start() {
        if (running) return;
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    private void render() {

    }

    public abstract void draw(Graphics g);
	
	/** Called once every frame to update the game logic. */
	public abstract void update(double dt);
}