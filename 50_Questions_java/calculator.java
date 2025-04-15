import java.util.*;

public class calculator {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1");
    int num1 = sc.nextInt();

    System.out.println("Enter number 2");
    int num2 = sc.nextInt();

    System.out.println("Enter the operation you want to perform :-");
    sc.nextLine();
    char op = sc.next().charAt(0);

    switch(op){
      case '+' : System.out.println(num1+num2);
                 break;
      case '-' : System.out.println(num1-num2);
                 break;
      case '*' : System.out.println(num1*num2);
                break;
      case '/' : System.out.println(num1/num2);
                break;
      default : System.out.println("Not a valid number or operation");
    }
    
  }
  
}
