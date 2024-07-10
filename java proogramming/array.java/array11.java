import java.util.Arrays;
public class array11 {
    public static void toFindMaxAndMinNumber(int arr[]){
       int min= Integer.MAX_VALUE; 
       int max = Integer.MIN_VALUE;
        Arrays.sort(arr); //1,3,4,5,9
    for(int i=0; i<arr.length;  i++){
        if(min>arr[i]){
            min = arr[i];
            
        }
        if(max<arr[i]){
            max = arr[i];   
             }
    }
    System.out.println("minimum element is:" + min);
    System.out.println("minimum element is:" + max);
         
    }
    public static void main(String args[]){
        int arr[] = {3,5,4,1,9};
        toFindMaxAndMinNumber(arr);
        
    }
    
}
