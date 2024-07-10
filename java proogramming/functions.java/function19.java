/*Write a Java method to compute the sum of the digits in an integer.
(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 )*/
import java.util.*;
public class function19{
    public static int sumdigit(int number){
        int sum = 0;
        while(number>0){
        int lastdigit = number % 10;
        sum = sum + lastdigit;
        number = number / 10;
 }
    return sum;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(sumdigit(n));

    }

}