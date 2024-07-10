 import java.util.*;
 public class loop3 {
  //sum of n natural numbers  
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int i = 0;
    int counter = 0 ;
   
    while(i<=n){
        counter = counter+i;
        i++;

    }
    System.out.println(counter);

  }
}
