import com.devbyeagle.gava.*;
import com.devbyeagle.gava.input.*;

public class Main {
	public static void main(String[] args) {
		final Game game = new Game(800, 600, null);
		game.run();

		while (true) {
			System.out.println(game.isKeyPreesed(KeyCode.UP | KeyCode.W));

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}