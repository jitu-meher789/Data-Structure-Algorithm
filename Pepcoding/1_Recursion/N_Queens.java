public class N_Queens {

    public static boolean isIt_A_SafePlace_forQueens(int[][]chess, int row, int col){
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row -1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
    public static void print_N_Queens(int[][]chess, String ans, int row){
        if(row == chess.length){
            System.out.print(ans + " ");
            return;
        }

        for(int col = 0; col < chess.length; col++){
            if(isIt_A_SafePlace_forQueens(chess,row, col) == true){
                chess[row][col] = 1;
                print_N_Queens(chess, ans + "{" +(row+1) + "-" + (col+1) +"} ", row+1);
                chess[row][col] = 0;
            }
        }
    }
    public static void main(String[] args) {

        int[][]chess = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
        print_N_Queens(chess,"",0);
    }
}
