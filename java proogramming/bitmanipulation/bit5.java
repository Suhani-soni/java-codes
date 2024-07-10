public class bit5 {
    public static int getclearbit(int n , int i ){
        int bitmask = ~(1<<i);
        return n&bitmask;
  }
    public static void main(String args[]){
        System.out.println(getclearbit(10,1));

    }
    
}
