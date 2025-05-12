package org.gava.math;

public class Vector2 {
	/** The x component of this {@link Vector2}. */
	public float x;
	
	/** The y component of this {@link Vector2}. */
	public float y;
	
	/** Constructs a new {@link Vector2} with components (0, 0). */
	public static final Vector2 Zero = new Vector2(0f, 0f);
	
	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector2(float value) {
		this(value, value);
	}
	
	@Override
	public String toString() {
		return "{X:" + x + " Y:" + y + "}";
	}
}