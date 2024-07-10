import java.util.*;
public class bit6 {
    public static int setithbit(int n ,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int getclearbit(int n , int i ){
        int bitmask = ~(1<<i);
        return n&bitmask;
  }
     public static int updateithbit(int n, int i, int newbit){
        if(newbit ==0){
            return getclearbit(n,i);
        }
        else {
            return setithbit(n,i);
        }
    }
    public static void main(String args ){
        System.out.println(updateithbit(10,2,1));

    }
    
}
