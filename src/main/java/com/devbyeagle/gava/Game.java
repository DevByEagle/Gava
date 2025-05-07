package com.devbyeagle.gava;

import javax.swing.*;
import java.awt.*;

public class Game {
    private final JFrame window = new JFrame();
    
    public Game() {
        window.add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public final void setResolution(int width, int height) {
        window.setSize(width, height);
    }

    /** 
     * Draws a filled rectangle on the window immediately using the specified color.
     * 
     * @param posX the x-coordinate of the rectangle
     * @param posY the y-coordinate of the rectangle
     * @param width the width of this rectangle
     * @param height the height of this rectangle
     * @param color the fill color of the rectangle
     */
    // TODO: Make rendering persistent using a buffered approach or proper painting.
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