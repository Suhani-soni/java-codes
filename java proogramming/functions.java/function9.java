// check if a number is prime or not
public class function9 {
   public static boolean isprime(int n){
    if(n==2)
    {
       return true;
    }
   boolean isprime = true;
   for(int i = 2;i<=n-1;i++){
    if(n%i==0)
    isprime = false;
   
   }
  return isprime;
}
   public static void main(String args[]){
    System.out.println( isprime(10));
   }
   }

