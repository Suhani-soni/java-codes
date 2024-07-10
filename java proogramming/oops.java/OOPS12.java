public class OOPS12 {
    //function overriding
    public static void main(String args[]){ 
        Deer veg = new Deer();
        veg.eats();

    }
    
}
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
    class Deer extends Animal{
        void eats(){
            System.out.println("eats grass only");
        }
    }

