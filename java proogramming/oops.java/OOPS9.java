public class OOPS9 {
    //multi-level inheritance
    public static void main(String args[]){
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.size = 15;
        System.out.println(dobby.size);
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
    int legs;
}
class Dogs extends Mammal{
    String breed;
}

