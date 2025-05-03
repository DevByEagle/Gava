package com.devbyeagle.gava;

import javax.swing.*;
import java.awt.*;

public class Game implements Runnable {
    private final JFrame window;
    private long lastTime = System.nanoTime();

    public Game(int width, int height, String title) {
        window = new JFrame(title);

        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public double getTime() {
        long now = System.nanoTime();
        double delta = (now - lastTime) / 1_000_000_000.0;
        lastTime = now;
        return delta;
    }

    @Override
    public void run() {
        window.setVisible(true);
    }

    // Private functions
}