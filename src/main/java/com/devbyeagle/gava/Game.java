package com.devbyeagle.gava;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class Game {
    private final JFrame window = new JFrame();

    public Game() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public final void setResolution(int width, int height) {
        window.setSize(width, height);
    }

    public final void drawRect(int posX, int posY, int width, int height, Color color) {
        SwingUtilities.invokeLater(() -> {
            Graphics g = window.getGraphics();
            if (g != null) {
                g.setColor(color);
                g.fillRect(posX, posY, width, height);
                g.dispose();
            }
        });
    }

    public final void run() {
        window.setVisible(true);
    }
}