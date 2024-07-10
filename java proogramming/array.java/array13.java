import java.util.Arrays;
public class array13 {
     public static void reverse(int arr[] ,int m , int n ){
      Arrays.sort(arr);
       int mindiff = Integer.MAX_VALUE;
      for(int i=0; i+m-1<n;  i++){
        int  diff = arr[i+m-1] - arr[i];
        if(diff<mindiff){
          mindiff = diff;
        }
        
  
      }
      System.out.print(mindiff);
        
     
    }
    public static void main(String args[]){
       int arr[] = {3,4,1,9,56,7,9,12};
       int m =  3;
       int n = arr.length; 
      
     reverse(arr,m,n);
      
      } 
}
