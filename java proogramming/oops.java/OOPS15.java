public class OOPS15 {
    public static void main(String args[]){
Queen q = new Queen();
          q.move();   
    }
    //interface
    
}
interface ChessPlayer{
    void move();
}
class Queen implements ChessPlayer{
 public void move(){
        System.out.println("left,right,up, down,diagonally");
    }
}
class Rook  implements ChessPlayer{
    public void move(){
           System.out.println("left,right,up, down");
       }
   }
   class King implements ChessPlayer{
    public void move(){
           System.out.println("left,right,up, down,diagonally-(only one step)");
       }
   }
