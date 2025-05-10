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

import org.gava.*;

public class MyGame extends Game {
  public MyGame() {
    super();
  }

  @Override
  protected void draw(Graphics g) {
    g.fillRect(100, 100, 100, 100);
  }

  @Override
  protected void update() {
    if (InputProcessor.getInstance().isKeyDown(Input.Keys.W)) {
      System.out.println("W was Pressed!");
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }
}
```