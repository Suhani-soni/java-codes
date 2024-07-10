public class RECURSION9 { 
    public static int optimizedpower(int a ,int n){
        // optimized  way to find x^n tc (0(n))
        if (n == 0){
             return 1;
        }
       int halfpower= optimizedpower(a,n/2);
       int halfpowersq = halfpower * halfpower;
       if(n% 2 != 0){
        halfpowersq = 2* halfpowersq;
       } 
        return halfpowersq;
    }

    public static void main(String args[]){
        
        System.out.println(optimizedpower(2,5));
    }
    
}
