import java.util.*;

public class funcy_Chess {

    public static Scanner sc = new Scanner(System.in);
    public static int[][]grid = new int[10][10]; 
    public static int total_ones, ans = -1, N = 10 ,n;
    public static int dx[] = {1, -1, 1, -1, 2, 2, -2, -2};
    public static int dy[] = {2, 2, -2, -2, -1, 1, -1, 1};

    public static void input_grid(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
                if(grid[i][j] == 1){
                    total_ones++;
                }
            }
        }
    }
    public static void knight(int x, int y, int count){

        ans = Math.max(ans,count);


        for(int i =0; i < 8; i++){
            int x_cordinates = x + dx[i];
            int y_cordinates = y + dy[i];

            if(x_cordinates >= 0 && x_cordinates < N && y_cordinates >= 0 && 
               y_cordinates < N && grid[x_cordinates][y_cordinates] == 1){


                grid[x_cordinates][y_cordinates] = 0;
                knight(x_cordinates, y_cordinates, count+1);
                grid[x_cordinates][y_cordinates] = 1;
            }
        }
    }
    public static void main(String[] args) {
        n = sc.nextInt();
        input_grid();
    
        knight(0,0,1);

        System.out.println( total_ones - ans+1);
    }
}
