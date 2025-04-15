

// public class namste {
//    public static void main(String args[]){
//      Scanner sc =new Scanner(System.in);
//      int button = sc.nextInt();

//      if(button == 1){
//       System.out.println("Hello");
//      }
//      else if(button == 2){
//       System.out.println("Namaste");
//      }
//      else if(button == 3){
//       System.out.println("Bonjour");
//      }
//      sc.close();
//    }
// }
import java.util.*;
public class namste {
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int button = sc.nextInt();
  
  switch (button) {
    case 1:
      System.err.println("Hello");
      break;
    case 2:
      System.out.println("Namaste");
      break;
    case 3:
       System.out.println("Bonjour"); 
       break; 
    default:
       System.out.println("Invalid number");
      break;
  } 
  sc.close();
}

}
