package com.corndel.pixmate.drawings;

public class InvertedTriangle {
  public static void main(String[] args) {
    int rows = 10;
    StringBuilder triangle = new StringBuilder();

    for (int i = 0; i < rows; i ++) {
      for (int j = rows - i; j > 0; j--) {
        triangle.append("*");
      }
      triangle.append("\n");
    }

    System.out.println(triangle);
  }
}
