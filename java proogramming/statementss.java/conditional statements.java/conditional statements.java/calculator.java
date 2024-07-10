import java.util.*;
public class calculator {
    public static void main(String args[]){
    //income tax calculator
    Scanner sc = new Scanner(System.in);
    System.out.println("income is");
    int income  = sc.nextInt();
    int tax;
    if(income<500000){
       tax=0;
    }
    else if(income>=500000 && income<=1000000) {
       tax =(int)( income*0.2);
  }
  else
  {
    tax =(int)( income*0.3);
}
System.out.println("your tax is :" + tax);
}
}
