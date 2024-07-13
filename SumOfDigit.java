package practice_problem;
import java.util.Scanner;
//create the program that compute the sum of digit of an interger

public class SumOfDigit {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to the Sum of digit");
    System.out.println("enter the number ");
    int number = in.nextInt();
    //System.out.println(sumofdigit(number));
    System.out.println(SumOFDigit(number));

  }
 /*  public static int sumofdigit(int num){ 
    int sum = 0;
    while (num >  0 ){
    sum =  sum + (num %10);
    num = num /10;

    }
    return sum;
  }*/
  public static int SumOFDigit (int num){
    int sum;
    for( sum =0 ;num >0 ; num /=10){
      sum = sum + (num %10);
    }
    return sum;
    
  } 
  
}
