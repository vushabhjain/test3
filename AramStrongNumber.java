package practice_problem;
import java.util.Scanner;


public class AramStrongNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to the Armstrong Checker");
    System.out.print("Enter the number: ");
    int num = in.nextInt();
    boolean value = isArmstrong(num);
    if (value) {
      System.out.println(num + " is an Armstrong number");
    } else {
      System.out.println(num + " is not an Armstrong number");
    }
    in.close();
  }

  public static boolean isArmstrong(int num) {
    int originalNum = num;
    int value = numberOfDigits(num);
    int finalDigitSum = 0;
    while (num > 0) {
      int digit = num % 10;
      num /= 10;
      finalDigitSum += pow(digit, value);
    }
    return finalDigitSum == originalNum;
  }

  public static int numberOfDigits(int num) {
    int digits = 0;
    while (num > 0) {
      num /= 10;
      digits++;
    }
    return digits;
  }

  public static int pow(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    return result;
  }
}
