// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    static ArrayList<String> res = new ArrayList<>(); // Static arrayList.

    public static ArrayList<String> findPath(int[][] m, int n) {
           res.clear();

        // If source or destination is a obstacle.
        if (m[0][0] == 0 || m[n - 1][n - 1] == 0) {
            return res;
        }

        printPath("", m, 0, 0, n);
        return res;
    }

    static void printPath(String ans, int[][] maze, int row, int col, int n) {
        // Base Condition.
        if (row == n - 1 && col == n - 1) {
            res.add(ans);
            return;
        }

        // Can't go.
        if (maze[row][col] == 0) {
            return;
        }

        // Consider This Cell In My Path.
        maze[row][col] = 0;

        // To Travel Down.
        if (row < n - 1) {
            printPath(ans + 'D', maze, row + 1, col, n);
        }

        // To Travel Right.
        if (col < n - 1) {
            printPath(ans + 'R', maze, row, col + 1, n);
        }

        // To Travel Up.
        if (row > 0) {
            printPath(ans + 'U', maze, row - 1, col, n);
        }

        // To Travel Left.
        if (col > 0) {
            printPath(ans + 'L', maze, row, col - 1, n);
        }

        // BackTrack:- Remove The Changes That We Were Made.
        maze[row][col] = 1;
    }
}

