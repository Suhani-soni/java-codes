public class arrray8 {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0; i<numbers.length;i++){
           curr = curr + numbers[i];
           if(curr<0){
            curr = 0;
           }
           ms =Math.max(curr,ms);
        }
        System.out.println("largest subarray is :" + ms);
            
        }
    
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

    }
}
    

