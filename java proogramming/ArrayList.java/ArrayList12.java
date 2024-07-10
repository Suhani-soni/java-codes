import java.util.ArrayList;
//pair sum with tc O(n) in a sorted array
public class ArrayList12 {
    public static boolean PairSum(ArrayList<Integer> list , int target){
        int lp =0; 
        int rp = list.size()-1; 
        while(lp<rp){//(lp != rp)
      if(list.get(lp) + list.get(rp) == target){
        return true;
      }
      if(list.get(lp) + list.get(rp)< target){
        lp++;
      }
      else{
        rp--;
      }
        }
        return false;
    }
    public static void main(String args[]){
         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
         int target = 50;
         System.out.println(PairSum(list, target));
    }
    
}
