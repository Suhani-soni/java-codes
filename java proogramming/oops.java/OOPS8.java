import java.util.*;
public class OOPS8 {
public static void main(String args[]){
     Fish shark = new Fish();
     shark.eat();
     }
    }
    //single level inheritance
    //base class
class Animal{
    String colour;
    int size;
    void  eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
   // derived class
     class Fish extends Animal{
        int fins;
        void swim(){
            System.out.println("swims");

        }
     }
    

