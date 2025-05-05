package com.devbyeagle.gava;

import javax.swing.JFrame;

public class Game implements Runnable {
    private JFrame window;

    public Game() {
        this(800, 600, "Gava");
    }

    public Game(int width, int height, String title) {
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(width, height);
    }

    @Override
    public final void run() {
        window.setVisible(true);
    }
}