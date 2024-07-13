package practice_problem;

import java.util.Arrays;
import java.util.Scanner;

public class Swapelement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int swappedNumber = swapFirstAndLastDigits(number);
        System.out.println("Number after swapping first and last digits: " + swappedNumber);
        
        scanner.close();
    }

    public static int swapFirstAndLastDigits(int number) {
        String numStr = Integer.toString(number);
        
        
        if (numStr.length() < 2) {
            return number; // No need to swap if the number has fewer than 2 digits
        }
        
        char[] numArr = numStr.toCharArray();
        char temp = numArr[0];
        numArr[0] = numArr[numArr.length - 1];
        numArr[numArr.length - 1] = temp;
        
        return Integer.parseInt(new String(numArr));
    }
}
