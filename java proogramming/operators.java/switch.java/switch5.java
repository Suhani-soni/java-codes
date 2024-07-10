import java.util.*;
public class switch5 {
    public static void main(String args[]){
        //Write a Java program to input week number(1-7) and print day of week name using switch case.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit");
        int number = sc.nextInt();
        switch(number) {
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("sunday");
            break;
            default  : System.out.println(" empty");
        }
    }
    
}
