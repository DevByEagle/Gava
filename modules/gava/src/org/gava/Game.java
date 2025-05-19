package org.gava;

import java.awt.*;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import org.gava.utils.Disposable;

public abstract class Game implements Disposable {
    private JFrame frame;
    private boolean running = false;
    private int fps;

    private final int TARGET_FPS = 60;

    // TODO: Allow window dimensions to be configurable via constructor or setters.
    public Game() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void dispose() {
        if (!running)
            return;
        running = false;
    }

    /** The main loop. Handles updating and rendering. */
    public final void run() {
        start();

        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        int frames = 0;
        int updates = 0;

        final double nsPerUpdate = 1_000_000_000.0 / TARGET_FPS;
        double delta = 0;

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / nsPerUpdate;
            lastTime = now;

            while (delta >= 1) {
                update();
                frames++;
                delta--;
            }

            render();
            updates++;

            if (System.currentTimeMillis() - timer >= 1000) {
                fps = frames;
                // System.out.println("FPS: " + fps + " | Updates: " + updates);
                frames = 0;
                updates = 0;
                timer += 1000;
            }
        }
    }

    /** @return the number of frames per second */
    public final int getFramesPerSecond() {
        return fps;
    }

    private void start() {
        if (running)
            return;
        running = true;
    }

    private void render() {
        if (frame.getBufferStrategy() == null) {
            frame.createBufferStrategy(2);
            return;
        }

        var g = frame.getBufferStrategy().getDrawGraphics();
        draw(g);
        g.dispose();
        frame.getBufferStrategy().show();
    }

    /** Called once every frame to update the game logic. */
    public abstract void update();

    /**
     * Called once every frame to render graphics.
     * 
     * @param g the {@link Graphics} context for rendering.
     */
    public abstract void draw(Graphics g);
}