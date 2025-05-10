package org.gava;

import java.awt.event.KeyListener;

/**
 * Handles low-level user input events such as keyboard and mouse interactions.
 * <ul></ul>
 * <p><strong>Note:</strong> {@link Input.Keys} currently does not contain all possible key definitions.
 * For unsupported key codes, refer to the {@link java.awt.event.KeyEvent} constants.</p>
 */
public interface Input extends KeyListener {
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
        public static final int BACKSPACE = 0x8;
        public static final int C = 0x43;
        public static final int CAPS_LOCK = 0x14;
        public static final int COMMA = 0x2C;
        public static final int D = 0x44;
        public static final int DEL = 0x7F;
        public static final int DOWN = 0x28;
        public static final int LEFT = 0x25;
        public static final int RIGHT = 0x27;
        public static final int UP = 0x26;
        public static final int E = 0x45;
        public static final int ENTER = 0xa;
        public static final int EQUALS = 0x3D;
        public static final int F = 0x46;
        public static final int G = 0x47;
        public static final int H = 0x48;
        public static final int I = 0x49;
        public static final int J = 0x4A;
        public static final int K = 0x4B;
        public static final int L = 0x4C;
        public static final int LEFT_BRACKET = 0xa1;
        public static final int M = 0x4D;
        public static final int MINUS = 0x2D;
        public static final int N = 0x4E;
        public static final int O = 0x4F;
        public static final int P = 0x50;
        public static final int PERIOD = 0x2E;
        public static final int PLUS = 0x0209;
        public static final int PRINT_SCREEN = 0x9A;
        public static final int Q = 0x51;
        public static final int R = 0x52;
        public static final int RIGHT_BRACKET = 0xa2;
        public static final int S = 0x53;
        public static final int SEMICOLON = 0x3B;
        public static final int SHIFT = 0x10;
        public static final int SLASH = 0x2F;
        public static final int SPACE = 0x20;
        public static final int SYM = 0x9D; // The Meta key, on MacOS is Command (⌘) on Windows it CTRL
        public static final int T = 0x54;
        public static final int TAB = 0x9;
        public static final int U = 0x55;
        public static final int UNKNOWN = 0x0;
        public static final int V = 0x56;
        public static final int W = 0x57;
        public static final int X = 0x58;
        public static final int Y = 0x59;
        public static final int Z = 0x5A;
        public static final int ESCAPE = 0x1B;
        public static final int INSERT = 0x9B;
        
        public static final int NUMPAD_0 = 0x60;
		public static final int NUMPAD_1 = 0x61;
		public static final int NUMPAD_2 = 0x62;
		public static final int NUMPAD_3 = 0x63;
		public static final int NUMPAD_4 = 0x64;
		public static final int NUMPAD_5 = 0x65;
		public static final int NUMPAD_6 = 0x66;
		public static final int NUMPAD_7 = 0x67;
		public static final int NUMPAD_8 = 0x68;
		public static final int NUMPAD_9 = 0x69;
    
		public static final int NUMPAD_LEFT_PAREN = 0x0207;
		public static final int NUMPAD_RIGHT_PAREN = 0x020A;
		public static final int NUM_LOCK = 0x90;

        public static final int COLON = 0x0201;
		public static final int F1 = 0x70;
		public static final int F2 = 0x71;
		public static final int F3 = 0x72;
		public static final int F4 = 0x73;
		public static final int F5 = 0x74;
		public static final int F6 = 0x75;
		public static final int F7 = 0x76;
		public static final int F8 = 0x77;
		public static final int F9 = 0x78;
		public static final int F10 = 0x79;
		public static final int F11 = 0x7A;
		public static final int F12 = 0x7B;
        public static final int F13 = 0xF000;
		public static final int F14 = 0xF001;
		public static final int F15 = 0xF002;
		public static final int F16 = 0xF003;
		public static final int F17 = 0xF004;
		public static final int F18 = 0xF005;
		public static final int F19 = 0xF006;
		public static final int F20 = 0xF007;
		public static final int F21 = 0xF008;
		public static final int F22 = 0xF009;
		public static final int F23 = 0xF00A;
		public static final int F24 = 0xF00B;

        /** Converts the keycode to a readable string format. */
        public static String toString(int keycode) {
            if (keycode < 0) throw new IllegalArgumentException("keycode cannot be negative, keycode: " + keycode);
            switch (keycode) {
            case UNKNOWN:
                return "Unknown";
            case NUM_0:
                return "0";
            case NUM_1:
                return "1";
            case NUM_2:
                return "2";
            case NUM_3:
                return "3";
            case NUM_4:
                return "4";
            case NUM_5:
                return "5";
            case NUM_6:
                return "6";
            case NUM_7:
                return "7";
            case NUM_8:
                return "8";
            case NUM_9:
                return "9";
            case UP:
                return "Up";
            case DOWN:
                return "Down";
            case LEFT:
                return "Left";
            case RIGHT:
                return "Right";
            case A:
				return "A";
			case B:
				return "B";
			case C:
				return "C";
			case D:
				return "D";
			case E:
				return "E";
			case F:
				return "F";
			case G:
				return "G";
			case H:
				return "H";
			case I:
				return "I";
			case J:
				return "J";
			case K:
				return "K";
			case L:
				return "L";
			case M:
				return "M";
			case N:
				return "N";
			case O:
				return "O";
			case P:
				return "P";
			case Q:
				return "Q";
			case R:
				return "R";
			case S:
				return "S";
			case T:
				return "T";
			case U:
				return "U";
			case V:
				return "V";
			case W:
				return "W";
			case X:
				return "X";
			case Y:
				return "Y";
			case Z:
				return "Z";
            case COMMA:
				return ",";
			case PERIOD:
				return ".";
            case ALT:
                return "ALT";
            case SHIFT:
                return "Shift";
            case TAB:
				return "Tab";
			case SPACE:
				return "Space";
            case ENTER:
				return "Enter";
			case DEL:
				return "Delete"; // also BACKSPACE
            case MINUS:
				return "-";
			case EQUALS:
				return "=";
            case BACKSLASH:
				return "\\";
			case SEMICOLON:
				return ";";
            case SLASH:
				return "/";
            case ESCAPE:
				return "Escape";
            case INSERT:
				return "Insert";
			case NUMPAD_0:
				return "Numpad 0";
			case NUMPAD_1:
				return "Numpad 1";
			case NUMPAD_2:
				return "Numpad 2";
			case NUMPAD_3:
				return "Numpad 3";
			case NUMPAD_4:
				return "Numpad 4";
			case NUMPAD_5:
				return "Numpad 5";
			case NUMPAD_6:
				return "Numpad 6";
			case NUMPAD_7:
				return "Numpad 7";
			case NUMPAD_8:
				return "Numpad 8";
			case NUMPAD_9:
				return "Numpad 9";
			case COLON:
				return ":";
			case F1:
				return "F1";
			case F2:
				return "F2";
			case F3:
				return "F3";
			case F4:
				return "F4";
			case F5:
				return "F5";
			case F6:
				return "F6";
			case F7:
				return "F7";
			case F8:
				return "F8";
			case F9:
				return "F9";
			case F10:
				return "F10";
			case F11:
				return "F11";
			case F12:
				return "F12";
			case F13:
				return "F13";
			case F14:
				return "F14";
			case F15:
				return "F15";
			case F16:
				return "F16";
			case F17:
				return "F17";
			case F18:
				return "F18";
			case F19:
				return "F19";
			case F20:
				return "F20";
			case F21:
				return "F21";
			case F22:
				return "F22";
			case F23:
				return "F23";
			case F24:
				return "F24";
            case NUM_LOCK:
				return "Num Lock";
			case CAPS_LOCK:
				return "Caps Lock";
            default:
                // key name not found
                return null;
            }
        }
    }

    /**
     * Determines if a specific key is currently being held down by the user.
     * <ul></ul>
     * This method checks the real-time state of the keyboard input system to verify whether
     * the specified key is actively pressed. The key should correspond to a constant defined
     * in {@link Input.Keys}, which represents standard keyboard key codes.
     * 
     * @param key The integer key code as defined in {@link java.awt.event.KeyEvent} or {@link Input.Keys}.
     * @return {@code true} if the key is actively pressed; {@code false} otherwise.
     */
    public boolean isKeyPressed(int key);

    /**
     * Checks if the specified key is currently being held down.
     * 
     * @param key The key to check, using {@link java.awt.event.KeyEvent} or {@link Input.Keys} constants.
     * @return {@code true} if the key being held down; {@code false} otherwise.
     */
    public boolean isKeyDown(int key);
}