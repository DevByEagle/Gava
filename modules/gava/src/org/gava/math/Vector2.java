package org.gava.math;

public class Vector2 {
    /** The X component of this {@link Vector2}. */
    public float x;

    /** The Y component of this {@link Vector2}. */
    public float y;

    public static final Vector2 Zero = new Vector2(0, 0);

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Determines if this instance is equivalent to the provided object.
     * 
     * @param obj The object to be compared with this instance.
     * @return {@code true} if both objects are considered equal; {@code false}
     *         otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector2) {
            return equals((Vector2) obj);
        }

        return false;
    }

    public boolean equals(Vector2 other) {
        return (x == other.x) && (y == other.y);
    }

    @Override
    public String toString() {
        return String.format("(x = %.2f, y = %.2f)", this.x, this.y);
    }
}