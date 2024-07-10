import java.util.ArrayList;
import java.util.Collections;
public class ArrayList7 {
//sorting an arraylist in ascending and descendin order
public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(6);
    list.add(9);
    System.out.println(list);
     Collections.sort(list);  //ascending 
     System.out.println(list);
     Collections.sort(list, Collections.reverseOrder());
     System.out.print(list);
    }
}
