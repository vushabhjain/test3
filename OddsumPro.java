package practice_problem;
import java.util.Scanner;
// develop a program sum of all odd number from 1 to specific Number

public class OddsumPro{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the num;");
    int number = in.nextInt();
  System.out.println(Oddsum(number));


  }
  public static int Oddsum (int num ){
    int sum = 0;
    int i;
      for(i = 1 ; i <= num; i +=2){
      sum =sum +i;

    }
    return sum;
  }
  
}
