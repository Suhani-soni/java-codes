public class BACKTRACKING8 {
    public static int mazesolver(int maze[][] , int i, int j, int n){
        //base
        if(i  == n-1 && j == n-1 ){
            return 1;
        }
        if (i >= n || j >= n || i < 0 || j < 0 || maze[i][j] == 0) { // Boundary and obstacle check
            return 0;
        }
        //recursion 
        // mark current cell as visite 
        maze[i][j] =  0;
        //down
            int w1 = mazesolver(maze,i , j+1 , n); 
        //up
        int w2 = mazesolver(maze,i , j-1 , n); 
        //right
        int w3 = mazesolver(maze,i+1 , j , n); 
        //left
        int w4 = mazesolver(maze,i-1 ,j , n);
        maze[i][j] = 1;
        return w1+w2+w3+w4;

        }
    
    //Rat in a Maze
    public static void main(String args[]){
        int maze[][] = {
                        {1,0,0,0},
                        {1,1,0,1},
                        {0,1,0,1},
                        {1,1,1,1}
                    };
    
   System.out.print(mazesolver(maze,0,0,4));
}
}
