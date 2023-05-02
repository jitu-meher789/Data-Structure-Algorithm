import java.util.*;

public class Rat_in_maze {

    public static int[][] visited=new int[1001][1001];
    public static int[][] solution=new int[1001][1001];

    public static boolean ratIn_a_maze(String[][]maze, int i, int j, int m, int n){
        
        if(i == m && j == n){
            solution[i][j] = 1;
            for(int x = 0; x <= m; x++){
                for(int y = 0; y <= n; y++){
                    System.out.print(solution[x][y] + " ");
                }
                System.out.println();
            }
            return true;
        }

        if(visited[i][j] == 1)
            return false;

        visited[i][j] = 1;
        solution[i][j] = 1;


        if(j+1 <= n && visited[i][j+1] == 0){
            boolean rightAns = ratIn_a_maze(maze, i, j+1, m, n);
            if(rightAns == true){
                return true;
            }
        }

        if(i+1 <= m && visited[i+1][j] == 0){
            boolean downAns = ratIn_a_maze(maze, i+1, j, m, n);
            if(downAns == true){
                return true;
            }
        }
        solution[i][j] = 0;
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();

        String[][] maze=new String[m][n];
        
        for(int i=0;i<m;i++)
        {

            String str=scn.next();
            for(int k=0;k<str.length();k++) {
                char cc=str.charAt(k);
                if(cc=='X') {
                    visited[i][k]=1;
                }
            }          

       }
       m--;n--;

        boolean ans = ratIn_a_maze(maze,0,0,m,n);

        if(ans == false){
            System.out.println("-1");
        }
    }
}
