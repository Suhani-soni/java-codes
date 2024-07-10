public class BACKTRACKING6 {
      //grid ways 
      public static int gridways( int i,int j, int n , int m ) {
         // Base case: If we reach the bottom-right corner
        if(i == n-1 && j == m-1){
            return 1;
        }
        // Boundary case: If we go out of the grid
        else if(i == n || j == m){
            return 0;
        }
          int w1 = gridways(i+1,j ,n,m);//move down 
          int w2 = gridways(i, j+1 ,n,m);//move right
          return w1+w2;
      }    
        public static void main(String args[]){
        int n = 3;
         int m = 3;
         System.out.print("total number of grid ways are := ");
          System.out.print(gridways(0,0,n,m));
      }
}
