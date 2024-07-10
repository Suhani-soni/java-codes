public class OOPS4 {
    public static void main(String args[]){
        //constructors
        Student p1 = new Student("suhani");
        p1.name = "suhani";
       System.out.println(p1.name);
    }
    
}
class Student{
    String name;
    int rollno;
    Student(String name){
       // System.out.println("constructor is called.....");
       this.name = name;
    }
}
