public class OOPS5 {
    //parameterized and non parameterized constructors
    public static void main(String args[]){
        //constructors
        Student p1 = new Student();
        Student p2 = new Student("suhabi3");
        Student p3 = new Student(234);     
    }
    
}
class Student{
    String name;
    int rollno;
    Student(){                                        //non parameterized constructor
     System.out.println("constructor is called.....");
        }
    Student(String name){                             // parameterized constructor
    this.name = name;{
        System.out.println(this.name);
    }
    }
    Student(int rollno){                                      // parameterized constructor
        this.rollno = rollno;{
            
        System.out.println(this.rollno);
        }
         
}
}
