package org.gava;

public class GameTime {
	protected float deltaTime = 0;
	private long frameStart = 0;
	private int frames = 0;
	protected int fps;
	private long lastTime = System.nanoTime();
	
	protected void updateTime() {
		long time = System.nanoTime();
		deltaTime = (time - lastTime) / 1000000000.0f;
		lastTime = time;
		
		if (time - frameStart >= 1000000000) {
			fps = frames;
			frames = 0;
			frameStart = time;
		}
		frames++;
	}
}
