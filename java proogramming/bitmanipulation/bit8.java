public class bit8 {
    public static int  getclearithbits(int n, int i , int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) -1;
        int bitmark = a|b;
        return n&bitmark;
    }
    public static void main(String args[]){
        System.out.println(getclearithbits(10,2,4));


    }
    
}

