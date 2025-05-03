package com.devbyeagle.gava;

import java.awt.event.KeyEvent;

public class InputStream {
    public enum KeyCode {
        A(KeyEvent.VK_A);

        private final int keyCode;

        KeyCode(int keyCode) {
            this.keyCode = keyCode;
        }

        public static KeyCode fromKeyCode(int key) {
            for (KeyCode k : values()) {
                if (k.keyCode == k) {
                    return k;
                }
            }
            return null;
        }
    }
}