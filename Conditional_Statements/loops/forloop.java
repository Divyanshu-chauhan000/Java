// Table of any  number

// package loops;
// import java.util.*;

// public class forloop {
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Table You want");
//     int num = sc.nextInt();

//     for(int i = 1; i<= 10; i++){
//       System.out.println(num +" * " + i + " = "+ num*i);
//     }
//     sc.close();
//   }
// }

// import java.util.*;
// public class forloop {
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Number of iterations :");
//      int num = sc.nextInt();
//      for(int i=1; i<= num; i++){
//       System.out.println("Hello world !");
//      }
//     sc.close();
//   }
// }

// Reverse a Number  ******************************************************////////////////******************* */
// import java.util.*;

// public class forloop {
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter A Four digit number"); 
// int num = sc.nextInt();
// int reverse = 0;
// for(; num!=0; num= num/10){
//   int res = num%10;
//  reverse = reverse*10 + res;
// }
// System.out.println("Reverse is " + reverse);
// sc.close();
// }
  
// }

// *********************************************************CHECK PRIMALITY************************

// import java.util.*;
// public class forloop {
//   public static void main (String args[]){
//   Scanner sc = new Scanner(System.in);
//   int num = sc.nextInt();
//    boolean isPrime = true;
//   if(num <= 1) isPrime = false;

//   for(int i = 2 ;i <= num/2; i++){
//     if(num % i == 0){
//       isPrime = false;
//       break;
//     }
//   }
//   if(isPrime)
//   System.out.println(num + "is a prime number");
//   else{
//   System.out.println(num + "is not a prime number");
//   }
//   sc.close();
//   }
// }


//***************************************Sum of Digits**************************** */
// import java.util.*;
// public class forloop{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Four number you want to sum of digits of that number : ");
//     int num = sc.nextInt();
//     int sum = 0;

//     for(; num !=0; num= num/10){
//       int res = num %10;
//       sum = sum + res;
//     }
//     System.out.println("The Sum of entered digit is " + sum);
//     sc.close();
//   }
// }