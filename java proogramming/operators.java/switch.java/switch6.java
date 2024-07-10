import java.util.*;
public class switch6 {
    public static void main(String args[]){
 //Write a Java program that takes a year from the user and print whether that year is a leap year or not.
Scanner sc = new Scanner(System.in);
System.out.println("enter the year");
int year = sc.nextInt();
if(year % 4 ==0){
    System.out.println(" is a leap year");
}
else  {
    System.out.println("not a leap year");
}

 }
    }
