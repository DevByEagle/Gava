import java.awt.Color;

import com.devbyeagle.gava.Game;

public class Main extends Game {
	public Main() {
		super();
		setResolution(800, 600);
	}
	
	public static void main(String[] args) {
		Game g = new Main();
		g.run();
		g.drawRect(150, 100, 100, 100, Color.RED);
	}
}