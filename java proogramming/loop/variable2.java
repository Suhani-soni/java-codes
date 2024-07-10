import java.util.*;
public class variable2 {
    // enter cost of 3 items,output total of the item
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextInt();
        float pencil = sc.nextInt();
        float eraser = sc.nextInt();
        float total = pen+pencil+eraser;
        System.out.println("total cost is  "+ total);
        // bill with 18% gst
        float newTotal =total + (0.18f*total);
        System.out.println("bill with 18% tax is:" + newTotal);
        
    }
}
