public class pattern6{
    public static void hollo_rectangle(int row, int coloumn){
    for(int i=1;i<=row;i++)
    {
      for( int j=1;j<=coloumn;j++){
      if(i==1||  i==row  || j==1|| j==coloumn){
        System.out.print( "*");
      }
      else{
        System.out.print(" ");
      }
       
    }
    System.out.println();
    }
}
public static void main(String args[]){
    
   hollo_rectangle(4,4);
}
}