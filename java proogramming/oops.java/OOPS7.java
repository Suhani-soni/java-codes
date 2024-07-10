public class OOPS7 {
    public static void main(String args[]){
     Student s1 = new Student();
     s1.marks[0] = 100;
     s1.marks[1] = 200;
     s1.marks[2] = 300;
     s1.name = "suhani";
     System.out.println(s1.name);

     Student s2 = new Student(s1); //copy cnstructor
     s1.marks[2] = 400;
        s2.password ="soni";
        for(int i= 0; i<3; i++){
            System.out.println(s2.marks[i]);

        }
        System.out.println(s2.password);
     }
    
}
class Student{
    String name;
    String password;
    int rollno;
    int marks[];
// deep  copy constructor
  Student(Student s1){
    marks  = new int[3];
     this.name = s1.name;
     this.rollno =s1.rollno;
     for(int i =0 ; i<marks.length; i++){
        this.marks[i] = s1.marks[i];
    }
 }
 Student(){
    marks = new int[3];
    System.out.println("copy constructor");
 }
 
}
