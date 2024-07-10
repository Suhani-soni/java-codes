public class array3 {
    //largest and smallestt numbers in array
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
       if(largest < numbers[i]){
        largest = numbers[i];
    }
    if(smallest > numbers[i]){
        smallest = numbers[i];
    }
        }
        System.out.println("smallest number is :" + smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {56,34,39,70};
        System.out.print("largest number is :" + getlargest(numbers));
    }
    
}
