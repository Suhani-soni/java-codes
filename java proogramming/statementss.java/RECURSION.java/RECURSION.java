import java.util.*;
public class RECURSION {
  public static void main(String args[]){
  /*Write a Java program to input week number(1-7) and print day of week name
using switch case. */
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
switch(number){
  case 1 : System.out.println("Monday");
  break;
  case 2 : System.out.println("Tueday");
  break;
  case 3 : System.out.println("Wednesday");
  break;
  case 4 : System.out.println("Thursday");
  break;
  case 5 : System.out.println("Friday");
  break;
  case 6 : System.out.println("Satday");
  break;
  case 7 : System.out.println("Sunday");
  break;
  default : System.out.println("enter te valid number between 1-7");
}
  
}
  }
  


  

   