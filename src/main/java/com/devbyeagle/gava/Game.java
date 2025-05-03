package com.devbyeagle.gava;

import javax.swing.*;
import java.awt.*;
import com.devbyeagle.gava.math.Vector2;

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

    public void drawText(Font font, String text, Vector2 position) {
        drawText(text, (int) position.x, (int) position.x, font, window.getGraphics().getColor());
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