import java.util.*;
public class function18 {
public static boolean iseven( int n){
     if(n%2==0){
       return true;
    }
    else {
        return false;
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int num = sc.nextInt(); 
        if(iseven(num)){
        System.out.println("number is even");
    }
    else{
        System.out.println("number is odd");
}
}
}
    

