package practice_problem;
import java.util.Scanner;

public class LCMultiple {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("welcome to Least common myultiple ");
    System.out.println("enter the first number;- ");
    int first = in.nextInt();
    System.out.println("enter the  second number :- ");
    int second = in.nextInt();
    System.out.println(Lcm(first,second));

  }
  public static int Lcm (int first , int second){
int i = 1;
while(i <= first){
   int factor = first* i ;
  if(factor % second==0){
    return factor;
  }
  i++;

}
return 0;
  }

  }
  

