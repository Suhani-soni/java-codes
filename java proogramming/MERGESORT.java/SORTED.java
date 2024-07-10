public class SORTED {
    //search in rotated sorted array is important question 
    public static int search(int arr[], int target,int si,int ei){
        //base case
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2; 
        // If the target is found at the mid index
        if(arr[mid] == target){
            return mid;
        }
       // Check if the left half is sorted
        if(arr[si]<=arr[mid]){
            // If target is in the left half
            if(arr[si]<=target && target<=arr[mid]){ //left side
             return    search(arr,target,si,mid);
            }
            else{
                return    search(arr,target,mid+1,ei);
            }

        }
        else{
            // If the right half is sorted
            if(arr[mid]<=arr[ei]){
                //right
                if(arr[mid] <=target &&target<=arr[ei]){
                    return search(arr,target,mid+1,ei);
                }
                else{
                    return search(arr, target, si,mid);
                }
            }
        }
        return target;

    }

     public static void main(String args[]){
        int target = 6;
        int arr[] = {4,5,6,7,0,1,2};
       System.out.println(search(arr,target,0, arr.length-1));
    }
    
}
