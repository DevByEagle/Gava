import java.awt.Graphics;

import org.gava.Game;

public class Main extends Game {
    @Override
    public void draw(Graphics g) {
        g.fillRect(100, 100, 100, 100);
    }

    @Override
    public void update() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        new Main().run();
    }
}