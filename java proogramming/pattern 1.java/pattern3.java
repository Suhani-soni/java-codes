public class pattern3{
    public static void main(String args[]){
        for(int i =1;i<=4;i++){
           int n = 4;
            for( int star = 1;star<= (n-i+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}