package org.gava.math;

public class Vector2 {
	public static final Vector2 Zero = new Vector2(0, 0);
	
	/** the x-component of this vector. **/
	public float x;
	/** the y-component of this vector. **/
	public float y;
	
	/**
	 * Creates a new {@link Vector2} with the given x and y values.
	 * 
	 * @param x The horizontal component of the vector.
	 * @param y The vertical component of the vector.
	 */
	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	/** 
	 * Converts the vector to a readable string in the format {@code (x, y)},
	 * making it easy to understand its coordinates at a glance.
	 */
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}