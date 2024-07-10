import java.util.*;
public class loop2 {
   
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      int counter = 1 ;
       int range = sc.nextInt();
        while(counter<=range){
           System.out.println(counter + " ");
           counter++;
       }

       System.out.println();
   }
}