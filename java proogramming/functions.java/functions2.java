 import java.util.star;
 public class functions2 {
    public static int calculatesum(int a, int b) {
    int sum = a+b;
    return sum ;
    
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum =  calculatesum(A,B);
    System.out.println("sum is " + sum);
    
}
}  