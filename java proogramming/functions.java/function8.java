//function overloading using data types
public class function8 {
    public static int sum(int a ,int b ){
        return a+b;
    }
    public static float sum(float a ,float b){
        return  a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(2,5));
        System.out.print(sum(8.0f,6.0f));
    }
    
}
