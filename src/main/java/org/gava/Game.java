package org.gava;

import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public abstract class Game implements Graphics {
	private final JFrame frame;
    private final GameTime gameTime = new GameTime();
    private boolean running = false;
    
    public Game() {
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
    
    @Override
    public final float getRawDeltaTime() {
    	return gameTime.deltaTime;
    }
    
    /** The main loop. Handles updating and rendering. */
    public final void run() {
    	start();
    	float delta = 0;
    	
    	while (running) {
    		gameTime.updateTime();
    		delta += getRawDeltaTime();
    		
    		while (delta >= 1) {
    			update();
    			delta--;
    		}
    		
    		render();
    	}
    	dispose();
    }
    
    private void render() {
    	BufferStrategy bs = frame.getBufferStrategy();
    	if (bs == null) {
    		frame.createBufferStrategy(3);
    		return;
    	}
    	
    	java.awt.Graphics g = bs.getDrawGraphics();
    	draw(g);
    	g.dispose();
    	bs.show();
    }
    
    /** Called once every frame to update the game logic. */
    public abstract void update();
    
    /** Called once every frame to render graphics.
     * @param g Graphics context */
    public abstract void draw(java.awt.Graphics g);
    
    public void dispose() {
    	if (!running) return;
    	running = false;
    }
    
    public void start() {
    	if (running) return;
    	running = true;
    }
}