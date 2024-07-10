import java.util.Scanner;
public class loop16 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
//Question 4 : Write a program to print the multiplication table of a number N, entered by the user.
int n = sc.nextInt();
for(int i = 1;i<=10;i++){
    System.out.println(n + "*" + i  + "="  + n*i);
    
}

}
}