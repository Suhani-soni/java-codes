public class MERGESORT1 {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " "); 
        }
        System.out.println();
    }
    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergesort(arr,si,mid); //leftpart
        mergesort(arr,mid+1,ei); //rightpart
        merge(arr, si,ei,mid);
    }
    
    public static void merge ( int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1;// right part
        int k  = 0 ; //temp arr 
        while(i<=mid &&  j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++; 
            }
            else{
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }
        //remaning elements of i &j;
        while(i<= mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // copy temp to arr
        for(k=0 , i=si; k<temp.length; k++,i++){
          arr[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1 );
       print(arr);

    }
    
}
