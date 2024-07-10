public class array7 {
    public static void maxsubarraysum(int numbers[]){
           int curr=0;
           int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                curr = 0;
                for(int k=start; k<=end; k++){
                      curr += numbers[k];
                         }
                         System.out.println(curr);
                               }
                               if(maxsum<curr){
                                maxsum = curr;
                               }
                            }
             
        System.out.println("print max sum " + maxsum );
        

    }
    
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        maxsubarraysum(numbers);
    }
}
    
    
    
    