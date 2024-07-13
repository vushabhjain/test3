package practice_problem;
import java.util.Scanner;

public class Factorialpro {
  public static void main (String [] args){
    Scanner in =new  Scanner(System.in);
    System.out.println(" welcome to the factorial calculator");
    System.out.println("enter the number :- ");
    long factt = in.nextLong();
    System.out.println(factorial(factt));


  }
  public static long  factorial (long num ){ 
    if (num < 2) {
      return 1;
    }
    long fact = 1;
    long i = 2;
    while(i <= num){
      fact= fact*i;
      i++;
    }
    return fact;

  }
  
}
