package org.gava;

import java.awt.event.KeyListener;

public interface Input extends KeyListener {
    /** Returns whether the key is pressed.
     * 
     * @param key The key code as found in {@link java.awt.event.KeyEvent}.
     */
    public boolean isKeyPressed(int key);
}