import java.awt.Color;

import com.devbyeagle.gava.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(800, 600, "Gava");
        game.run();
        game.drawText("Hello, World", 350, 300, 15, Color.RED);
    }
}