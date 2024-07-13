package practice_problem;
import java.util.Scanner;

public class GcdGreatest {
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the first number:- ");
    int first =in.nextInt();
    System.out.println("enert the second number:- ");
    int second = in.nextInt();
    System.out.println(Gcd(first, second));

  }
  public static int Gcd (int num1 ,int num2){
    int gcd = 1;
    int i = 2;
    int sm = least(num1, num2);
    while (i <= sm){
    if(num1 % i == 0 && num2 % i == 0){
     gcd =i;

    }
    i++;
   
  }
  return gcd;

  }
 
public static int least (int num1 , int num2){
  if (num1 < num2) {
    return num1;
  }else{
    return num2;
  }

}
  
}
