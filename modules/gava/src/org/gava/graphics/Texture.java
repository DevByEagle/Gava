package org.gava.graphics;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.gava.utils.Debug;

public class Texture {
    private Image image;

    public Texture(String filePath) {
        try {
            image = ImageIO.read(new File(filePath));
        } catch (IOException e) {
            System.err.println(Debug.traceback(String.format("Failed to load texture: %s", filePath)));
        }
    }
    
    protected final Image getImage() { return image; }
}