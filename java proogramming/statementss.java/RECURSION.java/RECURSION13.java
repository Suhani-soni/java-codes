public class RECURSION13 { 
    public static void printBitString(int n , int lastplace , String str){
        //base case
       if(n == 0){
        System.out.println(str);
        return;
       }
       
     printBitString(n-1 ,0 , str+"0");
     if(lastplace == 0){
        printBitString(n-1 ,1 , str+"1");
     }

       }
    
    public static void main(String args[]){
        printBitString(3 ,0 , " ");

    }
}
    
