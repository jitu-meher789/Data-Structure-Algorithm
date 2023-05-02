
public class Recursion_Backtracking_5 {
    public static int mazePath(int sr, int sc, int er, int ec, String ans, int[][] dir, String[] dirS) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (sr >= 0 && sc >= 0 && r <= er && c <= ec) {
                count += mazePath(r, c, er, ec, ans + dirS[d], dir, dirS);
            }
        }
        return count;
    }

    public static int floodFill(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        if (sr == board.length - 1 && sc == board[0].length - 1) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        board[sr][sc] = 1;

        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] == 0) {
                count += floodFill(r, c, board, ans + dirS[d], dir, dirS);
            }
        }
        board[sr][sc] = 0;
        return count;
    }

    public static int floodFill_Dir_8(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        if (sr == board.length - 1 && sc == board[0].length - 1) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        board[sr][sc] = 1;

        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] == 0) {
                count += floodFill_Dir_8(r, c, board, ans + dirS[d], dir, dirS);
            }
        }
        board[sr][sc] = 0;
        return count;
    }

    public static int floodFill_jump(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS,
            int radius) {
        if (sr == board.length - 1 && sc == board[0].length - 1) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        board[sr][sc] = 1;

        for (int d = 0; d < dir.length; d++) {
            for (int rad = 1; rad <= radius; rad++) {
                int r = sr + rad * dir[d][0];
                int c = sc + rad * dir[d][1];
            
                if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                    if(board[r][c] == 0)
                    count += floodFill_jump(r, c, board, ans + rad + dirS[d], dir, dirS, radius);
                }else{
                    break;
                }
            }
        }
        board[sr][sc] = 0;
        return count;
    }

    public static void main(String[] args) {
        // int[][]dir4 = {{-1,0},{0,1},{1,0},{0,-1}};
        // String[] dir4S= {"t","r","d","l"};
        // int[][]board4 = new int[3][3];

        // System.out.println(mazePath(0, 0,2,2,"", dir, dirS));
        // System.out.println(floodFill(0, 0,board,"", dir, dirS));

        int[][] dir8 = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
        String[] dir8S = { "t", "e", "r", "s", "d", "w", "l", "n" };
        int[][] board = new int[3][3];

        // System.out.println(floodFill_Dir_8(0, 0, board, "", dir8, dir8S));

        System.out.println(floodFill_jump(0, 0, board, "", dir8, dir8S,1));


    }
}
