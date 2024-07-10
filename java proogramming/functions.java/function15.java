//Write a Java method to compute the average of three numbers..
 /*public class function15 {
    public static int numbers(int a  , int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        System.out.println(numbers(5,5,10));
    }
    
}*/
import java.util.*;
public class function15 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Input the first number: ");
double x = sc.nextDouble();
System.out.print("Input the second number: ");
double y = sc.nextDouble();
System.out.print("Input the third number: ");
double z = sc.nextDouble();
System.out.print("The average value is " + average(x, y, z)+"\n" );
}
public static double average(double x, double y, double z) {
return (x + y + z) / 3;
}
}
