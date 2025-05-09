package com.devbyeagle.gava;

import java.awt.event.KeyEvent;

/**
 * Provides a foundational interface for handling user input, currently supporting keyboard and mouse interactions.
 * 
 * <br><br>
 * This abstraction allows developers to query the state of keyboard keys and mouse input in a consistent,
 * platform-independent manner. Mouse input serves as a substitute for touchscreen interaction on desktop platforms.
 * <br><br>
 * All keyboard input is mapped to standard constants defined in {@link Keys}, ensuring cross-platform compatibility
 * and avoiding reliance on system-specific key codes.
 */
public interface Input {
	/** Mouse buttons. */
	public static class Buttons {
		public static final int LEFT = 1;
		public static final int MIDDLE = 2;
		public static final int RIGHT = 3;
		public static final int BACK = 4;
		public static final int FORWARD = 5;
	}
	
	public static class Keys {
		public static final int NUM_0 = 0x30;
		public static final int NUM_1 = 0x31;
		public static final int NUM_2 = 0x32;
		public static final int NUM_3 = 0x33;
		public static final int NUM_4 = 0x34;
		public static final int NUM_5 = 0x35;
		public static final int NUM_6 = 0x36;
		public static final int NUM_7 = 0x37;
		public static final int NUM_8 = 0x38;
		public static final int NUM_9 = 0x39;
		public static final int A = 0x41;
		public static final int ALT = 0x12;
		public static final int B = 0x42;
		public static final int BACKSLASH = 0x5C;
		public static final int BACKSPACE = '\b';
		public static final int C = 0x43;
		public static final int CAPS_LOCK = 0x14;
		public static final int CLEAR = 0x0C;
		public static final int COMMA = 0x2C;
		public static final int D = 0x44;
		public static final int DEL = 0x7F;
		public static final int DOWN = 0x28;
		public static final int LEFT = 0x25;
		public static final int RIGHT = 0x27;
		public static final int UP = 0x26;
		public static final int E = 0x45;
		public static final int ENTER = '\n';
		public static final int EQUALS = 0x3D;
		public static final int F = 0x46;
		public static final int G = 0x47;
		public static final int H = 0x48;
		public static final int HOME = 0x24;
		public static final int I = 0x49;
		public static final int J = 0x4A;
		public static final int K = 0x4B;
		public static final int L = 0x4C;
		public static final int M = 0x4D;
	}
}