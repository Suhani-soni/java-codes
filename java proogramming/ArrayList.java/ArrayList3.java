import java.util.ArrayList;
public class ArrayList3 {
    //size in al
    public static void main(String args[]){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      System.out.println(list.size());
      for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i) + " ");
      }
      

    }
    
}
