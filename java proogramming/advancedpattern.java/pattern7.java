public class pattern7 { 
    public static void pyramid(int n){
        for(int i =1;i<=n;i++){
            for(int j=1; j<=n-1;j++){}
            System.out.print("*");

        }
        System.out.println();
    }
    public static void main(String args[]){
        pyramid()
    }

    
}
