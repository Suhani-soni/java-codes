import java.util.ArrayList;
public class ArrayList1 {
public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      System.out.println(list);
   list.get(1);
    //get operation 
  int element =  list.get(2);
      System.out.print(element);
    //remove operation
   list.remove(3);
    System.out.print(list);
    //set element at index  
    list.set(1,5);
   System.out.print(list);
   


}

    
}
