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

    public boolean isKeyPressed(int key) {
        return InputStream.KeyCode.fromKeyCode(key) != null;
    }

    @Override
    public void run() {
        window.setVisible(true);
    }

    // Private functions
}