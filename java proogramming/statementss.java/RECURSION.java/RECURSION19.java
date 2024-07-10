import java.util.*;
public class RECURSION19 {
    
        public static void main(String[] args){
        /*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers. */
System.out.println("enter the number");
Scanner sc = new Scanner(System.in);
int evensum = 0;
int number = 0;
int oddsum  = 0;
int choice = 0;
do{
     number = sc.nextInt();
if(number %2==0){
    evensum += number;
}
else{
    oddsum+= number;
}
System.out.println("press 1 for continue and 0 to stop  ");
choice = sc.nextInt();
        }
while(choice == 1);

    System.out.println("sum of evennumbers  " + evensum);
    System.out.println("sum of oddnumbers  " + oddsum);
 }
}
        