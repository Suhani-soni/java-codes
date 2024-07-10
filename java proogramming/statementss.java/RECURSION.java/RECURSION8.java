public class RECURSION8 {
    // print x^n
    public static int power(int x, int n ){
        if(n==0){
            return 1;
        }
       // int pxm1 = power(x,n-1);
       // int xn = x * pxm1;
       // return  xn;
       return x * power(x,n-1);
    }
    public static void main(String args[]){
        int x= 2;
        int n =10;
        System.out.println(power(x,n));
    }
    
}
