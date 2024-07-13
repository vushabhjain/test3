package practice_problem;
import java.util.Scanner;

public class ReverseDigit {
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    System.out.println("welcome to reverse the digit");
    System.out.println("enter the numbers you want to reverse:-  ");
    int number = in.nextInt();
    System.out.println(ReverseNo(number));


  }

  public static int ReverseNo (int num){
    int sum ;
    for(sum = 0; num > 0; num/=10){
      int rem = num%10;
      sum = sum *10 + rem;
    }
    return sum;
  }
        
}
