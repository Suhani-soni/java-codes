public class RECURSION2 {
    public static void increasingnum(int n){
        if(n==1){
System.out.print(n +" ");
return; 
        }
          n* increasingnum(n-1);
        System.out.print(n  + (n-1)+ " ");
        
        
    }
    
    public static void main(String args[]){
        int n = 5 ;
        increasingnum( n);

    }
}

