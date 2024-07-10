public class OOPS10 {
    //hierarchial inheritance 
    public static void main(String args[]){
        Mammal human = new Mammal();
        human.legs();
        human.size = 5;
        System.out.println(human.size);
    }
    
}
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
class Mammal extends Animal{
    void legs(){
        System.out.println("legs");
    }
}
class Fish extends Animal{ 
    void swim(){
        
            System.out.println("swim");
        
    }
}
class Bird extends Animal{
 void fly(){
    System.out.println("fly");
}
}