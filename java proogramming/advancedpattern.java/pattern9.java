public class pattern9 { 
    public static void pyramid(int n){
        int m= 4;
        for(int i= 1;i<=n;i++) {
            for(int j=1;j<=4-i+1;j++);{
                System.out.print("*");
            }
            for(int j=1;j<=m-(4-i+1);j++ );{
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pyramid(4);
    }
    
}
