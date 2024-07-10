

import java.util.*;
public class adults{
    public static void main(String args[]){
        //a person is adult or not 
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        
        if(age>=18){
            System.out.println("person is adult");
        }
        else{
            System.out.println("person is not adult");
        }
        if(age>13 && age<18){
            System.out.println("person is teenager");
        }
    }
}