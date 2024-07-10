import java.util.ArrayList;
public class ArrayList8 {
    // multidimension arraylist
    public static void main(String args[]){
        //mainlist
   ArrayList<ArrayList<Integer>>  mainlist = new ArrayList<>(); 
   //list1
   ArrayList<Integer> list = new ArrayList<>();
//list2
ArrayList<Integer> list2 = new ArrayList<>();
//list3
ArrayList<Integer> list3 = new ArrayList<>();
      for(int i=1; i<=5; i++){
        list.add(1*i);
        list2.add(2*i);
        list3.add(3*i);
     }
       mainlist.add(list);
       mainlist.add(list2);
       mainlist.add(list3);
    //  System.out.print(mainlist);
     //nested loop 
     for(int j=0; j<mainlist.size(); j++){
        ArrayList<Integer> currlist  = mainlist.get(j);
        for(int k=0; k<currlist.size(); k++){
            System.out.print(currlist.get(k) + " ");
        }
        System.out.println();
     }
     System.out.print(mainlist);
    }
} 

