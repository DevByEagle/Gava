<h1 align="center">
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="assets/GavaWhite.png">
    <source media="(prefers-color-scheme: light)" srcset="assets/GavaBlack.png">
    <img alt="Gava" src="assets/GavaBlack.png">
  </picture>
  &nbsp;
</h1>

Gava is a lightweight, flexible, and easy-to-use gaming library for Java. Designed for 2D game development, it provides tools for graphics, input handling, game loops, and more.

---

## Usage

```java
import java.awt.Graphics;

import org.gava.Game;

public class MyGame extends Game {
  final Sprite player;

  public MyGame() {
   player = new Sprite(new Texture("/icon.ico")); // Put your Texture for your Sprite here.
  }

  @Override
  public void draw(Graphics g) {
    player.draw(g);
  }

  @Override
  public void update() {}

  public static void main(String[] args) {
    new MyGame().run();
  }
}
```