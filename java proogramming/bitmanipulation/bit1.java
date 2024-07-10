public class bit1 {
     //check no is odd or even 
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n & 1) == 0){
            System.out.println("even number");        
    }
    else  {
        System.out.println("odd number");
    }
}
    public static void main(String args[]){
        oddoreven(5);
        oddoreven(4);
        oddoreven(12);

         }
    }
