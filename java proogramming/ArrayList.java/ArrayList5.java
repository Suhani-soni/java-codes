import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String args[]){
      
        ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      int maxnumber = Integer.MIN_VALUE;
      for(int i=0; i<list.size(); i++){
          // if(maxnumber<list.get(i)){
           // maxnumber = list.get(i);
           maxnumber = Math.max(maxnumber, list.get(i));
        }
        System.out.print( "maximum number is =   "   + maxnumber);
      }
    }
