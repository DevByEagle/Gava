import java.awt.Graphics;

import com.devbyeagle.gava.*;

public class Main extends Game {
	public Main() {
		super();
	}

	@Override
	protected void update() {}

	@Override
	protected void draw(Graphics g) {
		g.fillRect(100, 100, 100, 100);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}