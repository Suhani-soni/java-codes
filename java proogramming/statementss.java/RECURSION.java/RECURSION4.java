public class RECURSION4 {
    public static int calsum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = calsum(n-1);
        int sn = n+ snm1;
        return sn;
    }
    public static void main(String args []){
        int n  = 5;
        System.out.print(calsum (n));

    }
    
}
