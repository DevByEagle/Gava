package org.gava.graphics;

import org.gava.math.Vector2;

/**
 * The {@code Entity} class is the foundational superclass for all in-game objects and actors.
 * It provides essential structure and behavior common to any interactive or non-interactive
 * element within the game world. This includes player characters, non-playable characters (NPCs),
 * environmental props, physics objects, and more.
 * 
 * <p>
 * Each entity maintains a unique identifier, spatial attributes such as position.
 * </p>
 */
public class Entity {
    /** Position of the entity in 2D world space. */
	public final Vector2 position = Vector2.Zero;
    public int speed;
}