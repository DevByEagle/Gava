package com.devbyeagle.gava;

import javax.swing.*;
import java.time.LocalTime;

public class Game implements Runnable {
    private final JFrame window;

    public Game(int width, int height, String title) {
        window = new JFrame(title);

        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int getFPS() {
        return 0;
    }

    public void log(String message, Object... args) {
        String time = LocalTime.now().withNano(0).toString();
        String formattedMessage = String.format(message, args);
        System.out.println("[" + time + "] " + formattedMessage);
    }

    @Override
    public void run() {
        window.setVisible(true);
    }
}