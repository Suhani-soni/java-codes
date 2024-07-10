public class OOPS3 {
    //getters & setters
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColour("blue");
        System.out.println(p1.getcolour());
p1.setTip(5);
System.out.println(p1.gettip());

    }
    
}
class Pen{
   private String colour;
      private int tip;
       String getcolour(){
        return this.colour;
       }
       int gettip(){
        return this.tip;
       }
       void setColour(String newColour){
       this.colour = newColour;
   } void setTip(int newTip){
       this.tip = newTip;
   }

}
