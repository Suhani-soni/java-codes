import java.util.ArrayList;
public class ArrayList14 {
    public static boolean monotonic( ArrayList<Integer> nums){
        if(nums.size()<2){
            return true;
        }
       boolean inc = true;
       boolean dec = true;
       for(int i=0; i<nums.size()-1; i++){
    //to acces the i+1 element at the i psition -1 is neccesary
        if(nums.get(i)<nums.get(i+1)){
            dec = false;
        }
        if(nums.get(i)>nums.get(i+1)){
            inc = false;
        }
    }
    return inc|| dec;
}
   public static void main(String args[]){
    ArrayList<Integer>  nums = new ArrayList<>();
    nums.add(3);
    nums.add(2);
    nums.add(5);
     System.out.println(monotonic(nums));

   }
}
