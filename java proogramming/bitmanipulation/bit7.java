public class bit7 {
    //clear last i bits
    public static int clearithbit(int n , int i){
        int bitmask = (~0)<<i;
        return n&bitmask;

    }
    public static void main(String args[]){
        System.out.println(clearithbit(10,2));

    }
    
}
