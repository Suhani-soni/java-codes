import java.util.*;
public class loop12 {
    public static void main(String args[]){
        //check no is prime or not(2,3,5,7,11.....)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("is prime");
        }
        else{
        boolean isprime = true;
        for(int i =2; i<=n-1;i++){
            if (n%i ==0) {
                isprime = false;
            }
        }
      if(isprime == true){
            System.out.println("n is prime");
        }
        else{
            System.out.println("n not is prime");
        }

    }
}
}