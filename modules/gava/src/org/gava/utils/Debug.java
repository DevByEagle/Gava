package org.gava.utils;

public final class Debug {
    public static String traceback(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(message).append("\n");
        sb.append("stack traceback:\n");

        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        // Skip first few frames (getStackTrace, traceback)
        for (int i = 3; i < stack.length; i++) {
            StackTraceElement element = stack[i];
            String fileName = element.getFileName() != null ? element.getFileName() : "Unknown Source";
            int lineNumber = element.getLineNumber();
            String methodName = element.getMethodName();

            sb.append(String.format("    [%s]:%d: in function '%s'%n", fileName, lineNumber, methodName));
        }

        return sb.toString();
    }
}