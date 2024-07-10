public class bit9 {
    public static boolean ispowerof2( int n){
        //number is power of 2 or not
        return(n & (n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(ispowerof2(4));
    }
    
}
