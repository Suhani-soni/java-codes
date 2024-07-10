public class OOPS14 {
    //abstract class
    public static void main(String args[]){
        Tomato rabit = new Tomato();
        //animal>hourse>tomato
        }
    
}
abstract class Animal{
    Animal(){
        System.out.println("constructor of animal class");
    }
     void eats(){
        System.out.println("eats food ");
    }
     abstract void walk();
 }
 class Horse  extends Animal{
    Horse(){
        System.out.println("constructor of horse class");
    }
void walk(){
    System.out.println("have 4 legs ");
}
 }
 class Tomato extends Horse{
    Tomato(){
        System.out.println("constructor of tomato class");
    }
    void walk(){
        System.out.println("have no legs ");
    }
 }
