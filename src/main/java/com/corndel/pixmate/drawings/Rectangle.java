package com.corndel.pixmate.drawings;

import java.util.Scanner;

public class Rectangle {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
    
    // Ask for height and width
    System.out.print("Enter the height of the rectangle: ");
    int height = scanner.nextInt();

    System.out.print("Enter the width of the rectangle: ");
    int width = scanner.nextInt();
    
    // Call the method to make the rectangle
    makeRectangle(height, width);
    
    // Close the scanner
    scanner.close();
  }

  public static void makeRectangle(int height, int width) {
    StringBuilder rectangle = new StringBuilder();

    for (int i = 0; i < height; i ++) {
      for (int j = 0; j < width; j++) {
        rectangle.append("*");
      }
      rectangle.append("\n");
    }

    System.out.println(rectangle);
  }
}
