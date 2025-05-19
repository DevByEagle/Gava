package org.gava.graphics;

import java.awt.Graphics;

import org.gava.math.Vector2;

public class Sprite {
    private Texture texture;

    public Vector2 position = Vector2.Zero;

    public Sprite() {
        this.texture = null;
    }

    public Sprite(Texture texture) {
        this.texture = texture;
    }

    public void draw(Graphics g) {
        if (texture != null && texture.getImage() != null) {
            // Draw the image at the sprite's position (x, y)
            g.drawImage(texture.getImage(), (int) position.x, (int) position.y, null);
        }
    }
}