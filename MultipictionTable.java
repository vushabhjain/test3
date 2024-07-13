package practice_problem;
import java.util.Scanner;
// develope a program that print multiplication table for given number
public class MultipictionTable {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the range ;- ");
    int range = in.nextInt();
System.out.println("enter the number: -");
int number = in.nextInt();
multiolication(number, range);


  }
  public static void multiolication(int num , int range){
    for(int i = 1 ; i <= range; i ++){
      System.out.println(num + " X " + i + " = " + (num*i)); 
    }

  }
}