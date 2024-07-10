public class OOPS11 {
    //method/ function overloading
    public static void main(String args[]){ 
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum(2,3,6));
        System.out.println(cal.sum((float)2.5,(float)3.9));

    }
    
} 
class Calculator {

int sum(int a, int b){
    return a+b;
}
int sum(int a, int b,int c ){
    return a+b+c;
}
float sum(float a, float b){
    return a+b;
}
}
