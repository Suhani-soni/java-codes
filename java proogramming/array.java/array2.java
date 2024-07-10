public class array2 {
    //passing array as arguments
    public static void update(int marks[], int changable){
         changable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97,98,99};
        int changable = 5;
             update(marks , changable);
             System.out.println(changable);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    System.out.println();

    }
    
}
