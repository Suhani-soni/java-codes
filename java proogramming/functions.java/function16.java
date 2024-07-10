import java.util.Scanner;
public class function16{
    public static boolean ispalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while(palindrome != 0){
        int lastdigit = palindrome % 10;
        reverse = reverse * 10 + lastdigit;
        palindrome = palindrome / 10;
 }
          if(number == reverse){
          return true;
          }
          else{
            return false;
          }
        } 
         public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number :");
            int palindrome = sc.nextInt();
             if(ispalindrome(palindrome)){
                System.out.println("number : " + palindrome +" is a palindroe");
            }
            else {
                System.out.println("number : " + palindrome +" is not a palindroe");
            }

           }
          
        }
    

