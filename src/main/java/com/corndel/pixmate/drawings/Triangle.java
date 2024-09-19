package com.corndel.pixmate.drawings;

import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
    
    // Ask for rows
    System.out.print("Enter the number of rows of the triangle: ");
    int rows = scanner.nextInt();
    
    // Call the method to make the triangle
    makeTriangle(rows);
    
    // Close the scanner
    scanner.close();
  }

  public static void makeTriangle(int rows) {
    StringBuilder triangle = new StringBuilder();

    for (int i = 0; i < rows; i ++) {
      for (int j = 0; j < i + 1; j++) {
        triangle.append("*");
      }
      triangle.append("\n");
    }

    System.out.println(triangle);
  }
}
