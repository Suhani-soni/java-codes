import java.util.*;
public class ArrayList16{
public  ArrayList<Integer> findlonely(ArrayList<Integer> nums) {
    Collections.sort(nums);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i=1; i < nums.size()-1; i++) {
    if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)){
       list.add(nums.get(i));
    }
}
//for single element
if(nums.size() == 1){
    list.add(nums.get(0));
}
//for first and last element
if(nums.size()>1){
    //first element
    if(nums.get(0) +1 <nums.get(1)){
        list.add(nums.get(0));
    }
    if(nums.get(nums.size()-2)+1 < nums.get(nums.size()-1)){
        list.add(nums.get(nums.size()-1));
    }
}
return list;
    }
 public static void main(String[] args) {
    ArrayList16 arrayList16 = new ArrayList16();
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(3);
    nums.add(5);
    nums.add(3);

    ArrayList<Integer> lonelyNumbers = arrayList16.findlonely(nums);
    System.out.println(lonelyNumbers);
}
}