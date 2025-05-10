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
  // This is to update the games logics.
  @Override
  public void update() {}

  // This is to draw graphics to the screen.
  @Override
  public void draw(Graphics g) {
    g.fillRound(100, 100, 100, 100);
  }

  public static void main(String[] args) {
    new MyGame().run();
  }
}
```