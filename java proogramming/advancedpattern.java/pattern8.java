public class pattern8 {
    //print inverted pyramid 
    public static void invertedpyr(int n){
        //for rows
        for(int i=1; i<=n ;i++){
           //for spaces
            for( int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
                // stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");

                }
                System.out.println(); 
            }
            }
        public static void main(String args[]){
        invertedpyr(4);
    }
}

