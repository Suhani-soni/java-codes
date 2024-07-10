public class BACKTRACKING9 {
    public static int mazesolver(int maze[][], int i, int j, int n) {
        // Base case
        if (i == n - 1 && j == n - 1) {
            return 1;
        }
        if (i >= n || j >= n || i < 0 || j < 0 || maze[i][j] == 0) { // Boundary and obstacle check
            return 0;
        }

        // Mark current cell as visited (fixed typo)
        maze[i][j] = 0;

        // Recursion 
        int w1 = mazesolver(maze, i, j + 1, n); // right
        int w2 = mazesolver(maze, i, j - 1, n); // left
        int w3 = mazesolver(maze, i + 1, j, n); // down
        int w4 = mazesolver(maze, i - 1, j, n); // up

        // Unmark the current cell (backtracking)
        maze[i][j] = 1;

        return w1 + w2 + w3 + w4;
    } // Added missing closing brace for the method

    // Rat in a Maze
    public static void main(String[] args) { // Fixed typo in "args"
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 1}
        };

        System.out.print(mazesolver(maze, 0, 0, 4)); // Moved inside the main method's braces
    } // Added missing closing brace for the main method
} // Added missing closing brace for the class
