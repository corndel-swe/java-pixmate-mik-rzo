package com.corndel.pixmate.drawings;

public class TriangleSandwich {
  public static void main(String[] args) {
    int peak = 5;
    StringBuilder shape = new StringBuilder();

    for (int i = 0; i < peak; i ++) {
      for (int j = 0; j < i + 1; j++) {
        shape.append("*");
      }
      shape.append("\n");
    }

    for (int i = 1; i < peak; i ++) {
      for (int j = peak - i; j > 0; j--) {
        shape.append("*");
      }
      shape.append("\n");
    }

    System.out.println(shape);
  }
}
