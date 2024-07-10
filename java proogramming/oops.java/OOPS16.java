public class OOPS16 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname = "jvm"; 
         Student s2 = new Student();
         System.out.println(s2.schoolname);
         Student s3 = new Student();
         s3.schoolname = "abc";
         System.out.println(s3.schoolname);

    }
    
}

class Student{
    String name;
    int rollno;

    static String schoolname;
     void setName(String name){
        this.name = name;
     }

String getName() {
    return this.name;
}
}