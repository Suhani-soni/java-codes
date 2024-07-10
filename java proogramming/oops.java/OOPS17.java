public class OOPS17 {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.colour);
    }
    //super() keyword
    
}
class Animal{
    String colour;
    Animal(){
        System.out.println("animal constructor is called");
    }

}
class Horse extends Animal{
    Horse(){
        super.colour = "brown";
        System.out.println("horse constructor is called");
    }
} 