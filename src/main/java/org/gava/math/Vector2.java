package org.gava.math;

import sun.java2d.marlin.FloatMath;

public class Vector2 {
	public float x, y;
	
	public static final Vector2 Zero = new Vector2(0f, 0f);
	
	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector2(float value) {
		this(value, value);
	}
	
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector2) {
            return equals((Vector2)obj);
        }

        return false;
    }

    public boolean equals(Vector2 other) {
        return (x == other.x)&& (y == other.y);
    }

    /**
     * Round the members of this {@link Vector2} owards negative infinity.
     */
    public void floor() {
        x = (float) Math.floor(x);
        y = (float) Math.floor(y);
    }
    
    /**
     * 
     * @param value Source {@link Vector2}.
     * @return The rounded {@link Vector2}.
     */
    public static Vector2 floor(Vector2 value) {
    	value.x = (float) Math.floor(value.x);
    	value.y = (float) Math.floor(value.y);
    	return value;
    }
    
    /**
     * Round the members of this {@link Vector2} to the nearest integer value.
     */
    public void round() {
    	x = Math.round(x);
    	y = Math.round(y);
    }
}