public class pattern13 {
    public static void Butterfly_pattern(int n){
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
         System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
 }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println(); 
    }
    //for 2 half
     for(int i=n;i>=1; i--){
        for(int j=1;j<=i;j++){
     System.out.print("*");
    }
    for(int j=1; j<=2*(n-i); j++){
        System.out.print(" ");
}
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}
        
}
public static void main(String args[]){
    Butterfly_pattern(4);
}    
}
