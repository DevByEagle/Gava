import java.awt.Graphics;
import java.awt.event.KeyEvent;

import org.gava.*;

public class Main extends Game {
    public Main() {
        super();
    }

    @Override
    protected void update() {
        if (InputProcessor.getInstance().isKeyDown(Input.Keys.W)) {
            System.out.println("W was Pressed");
        }
    }

    @Override
    protected void draw(Graphics g) {
        g.fillRect(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}