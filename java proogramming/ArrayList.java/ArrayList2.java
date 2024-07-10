import java.util.ArrayList;
public class ArrayList2 {
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//0(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(12);
        System.out.println(list);
       System.out.print(list.contains(11));
       //one more adding method tc = 0(n)
       list.add(2,89);
       System.out.print(list);

    }
}
