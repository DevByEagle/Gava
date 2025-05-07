package com.devbyeagle.gava;

import javax.swing.*;

public class Game {
    private final JFrame window = new JFrame();

    public Game() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public final void setResolution(int width, int height) {
        window.setSize(width, height);
    }

    public final void run() {
        window.setVisible(true);
    }

    // Private methods
}