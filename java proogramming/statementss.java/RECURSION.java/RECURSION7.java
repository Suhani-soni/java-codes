public class RECURSION7 {
    public static int FirstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccurence(arr, key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {6,7,8,2,3,5,8,5};
        System.out.println(FirstOccurence(arr,5,0));
    }
    
}
