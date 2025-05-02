package com.devbyeagle.gava;

import javax.swing.*;

public class Game implements Runnable {
    private final JFrame window;

    public Game(int width, int height, String title) {
        window = new JFrame(title);

        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        window.setVisible(true);
    }
}