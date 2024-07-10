import java.util.*;
public class loop14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number =sc.nextInt();
        int fact = 1;
        for(int i=1;i<=number;i++){
            fact = fact * i;

        }
        System.out.println("factorial is " +  fact);
    }
}