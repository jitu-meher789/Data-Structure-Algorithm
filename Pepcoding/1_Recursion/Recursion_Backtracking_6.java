import java.util.*;
import java.util.Collections;
public class Recursion_Backtracking_6 {

    // https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
    // if you want all the path
    public static int flood_FIllMazePath(int[][]arr, int sr, int sc, String ans, int[][]dir, String[]dirS, ArrayList<String> res){
        int n = arr.length;
        int m = arr[0].length;
        if(sr == n-1 && sc == m - 1){
            res.add(ans);
            return 1;
        }
        
        arr[sr][sc] = 0; // block

        int count = 0;

        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r >= 0  &&  c >= 0 && r < n && c < m && arr[r][c] == 1){
                count += flood_FIllMazePath(arr, r, c, ans + dirS[d], dir, dirS, res);
            }
        }
        arr[sr][sc] = 1; // free
        return count;
    }
  


















    // https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
    // if you want only one path
    public static boolean flootFill_OneMazePath(int[][]arr, int sr, int sc, String ans, int[][]dir, String[]dirS){
        int n = arr.length;
        int m = arr[0].length;
        if(sr == n-1 && sc == m - 1){
            System.out.println(ans);;
            return true;
        }
        
        arr[sr][sc] = 0; // block

        boolean res = false;

        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r >= 0  &&  c >= 0 && r < n && c < m && arr[r][c] == 1){
                res = res || flootFill_OneMazePath(arr, r, c, ans + dirS[d], dir, dirS);
            }
        }
        arr[sr][sc] = 1; // free
        return res;
    }
  













    // longest path to reach destination
    public static int flootFill_LongestPath(int[][]arr, int sr, int sc,int[][]dir){
        int n = arr.length;
        int m = arr[0].length;
        if(sr == n-1 && sc == m - 1){
            return 0;
        }
        
        arr[sr][sc] = 1; // block

        int longestLen = -1;

        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r >= 0  &&  c >= 0 && r < n && c < m){
                if(arr[r][c] == 0){
                  int recAns = flootFill_LongestPath(arr, r, c, dir);
                  if(recAns != -1 && recAns + 1 > longestLen)
                    longestLen = recAns +1;
                }

            }
        }
        arr[sr][sc] = 0; // free
        return longestLen;
    }









        // shortest path to reach destination
    public static int flootFill_ShortestPath(int[][]arr, int sr, int sc,int[][]dir){
        int n = arr.length;
        int m = arr[0].length;
        if(sr == n-1 && sc == m - 1){
            return 0;
        }
        
        arr[sr][sc] = 1; // block

        int shortestLen = (int)1e9;

        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r >= 0  &&  c >= 0 && r < n && c < m){
                if(arr[r][c] == 0){
                  int recAns = flootFill_ShortestPath(arr, r, c, dir);
                  if(recAns != (int)1e9 && recAns + 1 < shortestLen)
                  shortestLen = recAns +1;
                }
            }
        }
        arr[sr][sc] = 0; // free
        return shortestLen;
    }







    //knigts tour
    public static boolean knights_tour(int[][]arr, int sr, int sc, int move, int[]dirX, int[]dirY){

        arr[sr][sc] = move;

        if(move == 63){
            return true;
        }

        boolean res = false;
        for(int d = 0; d < 8; d++){
            int r = sr + dirX[d];
            int c = sc + dirY[d];

            if(r >= 0 && c >= 0 && r < arr.length && c < arr[0].length && arr[r][c] == -1){
                res = knights_tour(arr, r, c, move + 1, dirX, dirY);
                if(res) 
                   return true;
            }
        }
        arr[sr][sc] = -1;
        return res;
    }
    public static void knights_tour(){
        int n = 8;
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = -1;

        int[] dirX = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] dirY = { 1, 2, 2, 1, -1, -2, -2, -1 };
        knights_tour(board,0,0, 0, dirX, dirY);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int[][] arr = {{0,  0, 0, 0},{0, -1, 0, 0},{-1, 0, 0, 0},{0,  0, 0, 0}};
        // String []dirS = {"U","R","D","L"};
        // int[][]dir = {{-1,0},{0,1},{1,0},{0,-1}};
        knights_tour();
    }
}