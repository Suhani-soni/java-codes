public class array15 {
     public static void sum(int nums[], int target ){
        for(int i=0; i<nums.length-1; i++){
if(nums[i] + nums[i+1] == target ){
   
    System.out.print(i);
    System.out.print(",");
    System.out.print(i+1);
}
        }
     }
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        sum(nums,target);
    }
    
}
