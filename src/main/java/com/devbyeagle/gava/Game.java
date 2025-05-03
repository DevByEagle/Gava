package com.devbyeagle.gava;

import javax.swing.*;

import com.devbyeagle.gava.math.Vector2;

import java.awt.*;

public class Game implements Runnable {
    private final JFrame window;

    public Game(int width, int height, String title) {
        window = new JFrame(title);

        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void drawText(String text, int posX, int posY, int fontSize, Color color) {
        drawText(text, posX, posY, new Font(window.getFont().getName(), Font.PLAIN, fontSize), color);
    }

    public void drawText(String text, Vector2 position, int fontSize) {
        drawText(text, (int) position.x, (int) position.y, fontSize, window.getGraphics().getColor());
    }

    @Override
    public void run() {
        window.setVisible(true);
    }

    // Private functions
    private void drawText(String text, int x, int y, Font font, Color color) {
        Graphics g = window.getGraphics();
        g.setFont(font);
        g.setColor(color);
        g.drawString(text, x, y);
    }
}