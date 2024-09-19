package com.corndel.pixmate.drawings;

public class Diagonal2 {
  public static void main(String[] args) {
    int rows = 10;
    StringBuilder shape = new StringBuilder();
  
    for (int i = 0; i < rows; i ++) {
      for (int j = 0; j < rows; j++) {
        if (i + j == rows - 1) {
          shape.append("*");
        } else {
          shape.append(" ");
        }
      }
      shape.append("\n");
    }

    System.out.println(shape);
  }
}
