package com.devbyeagle.gava;

public class task {
  public static void wait(double seconds) {
    try {
      Thread.sleep(double seconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
