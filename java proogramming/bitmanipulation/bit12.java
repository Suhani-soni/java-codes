 import java.util.*;
 public class bit12 {
    public static void main(String args[]){
        //swap using xor without third variable
        int x= 3,y=4;
       
        x= x^y;
        y= x^y;
        x= x^y;
        System.out.println(y);
    }
    
}
