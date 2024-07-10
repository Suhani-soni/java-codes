public class MERGESORT2 {
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){ //basecase condition
        if(si>ei){
            return;
        }   //kaam  //last element(pivot)
         int pindx =  partition(arr, si ,ei);
         quickSort(arr,si,pindx-1);
         quickSort(arr, pindx+1,ei);
        }
    
    public static int partition(int arr[] , int si ,int ei){
        int pivot = arr[ei];
        int i  = si-1;
        for(int j=si; j<ei; j++)
        {
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] =  arr[i];
                arr[i] = temp;
      }
    }
        i++; //for pivot
        int temp = pivot;
         arr[ei] =  arr[i];
       arr[i] = temp;
       return i;

    }
    public static void main(String args[]){
         int arr[] = {6,3,9,8,2,5};
         quickSort(arr, 0,arr.length-1);
         printarr(arr);

    }
    
}
