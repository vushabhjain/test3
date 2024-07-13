package practice_problem;
import java.util.Scanner;

public class PrimeChecker {

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("enter the number");
      int number = in.nextInt();
     // int number = 1; // Example number
      boolean isPrime = isPrime(number);

      if (isPrime) {
          System.out.println(number + " is a prime number.");
      } else {
          System.out.println(number + " is not a prime number.");


      }
  }

  public static boolean isPrime(int num) {
      // Check if number is less than 2
      if (num < 2) {
          return false;
      }

      // Check for divisibility from 2 up to num / 2
      for (int i = 2; i <= num / 2; i++) {
          if (num % i == 0) {
              return false;
          }
      }

      // If no divisors were found, the number is prime
      return true;
  }
}