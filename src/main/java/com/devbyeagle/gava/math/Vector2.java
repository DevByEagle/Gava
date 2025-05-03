package com.devbyeagle.gava.math;

public class Vector2 {
    public static final Vector2 Zero = new Vector2();

    public float x;
    public float y;

    public Vector2(float value) {
        this(value, value);
    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }
}