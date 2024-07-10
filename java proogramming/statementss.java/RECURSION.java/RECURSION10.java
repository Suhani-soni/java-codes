public class RECURSION10 { 
     public static int tilingproblem(int n){
        //base case conditions
         if(n ==0 || n ==1){
             return 1;
         }
         //vertical choices
        int fnm1 =  tilingproblem(n-1);
         //horizontal choices
        int fnm2 =  tilingproblem(n-2);
        int totways = fnm1 + fnm2;
        return totways;
     }
    public static void main(String args[]){
       System.out.println(tilingproblem(16));  
    }
    
}
