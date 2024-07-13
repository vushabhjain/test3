package practice_problem;

import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Welcome to the Fibonacci series generator");
      System.out.print("Enter the number of terms: ");
      int terms = in.nextInt();
      
      if (terms <= 0) {
        System.out.println("Please enter a positive number.");
      } else {
        System.out.println("Fibonacci series:");
        generateFibonacci(terms);
      }
    }
  }

  public static void generateFibonacci(int terms) {
    long first = 0, second = 1;
    int count = 0;
    
    while (count <= terms) {
      System.out.print(first + " ");
      
      long next = first + second;
      first = second;
      second = next;
      count++;
    }
    System.out.println();
  }
}
