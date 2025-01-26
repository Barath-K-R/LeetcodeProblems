package graphs;

public class SurroundedRegions {
    public static void solve(char[][] board) {
        int ROWS=board.length,COLS=board[0].length;
        for (int r = 0; r < ROWS; r++) {
            if (board[r][0] == 'O') {
                dfs( r, 0,board);
            }
            if (board[r][COLS - 1] == 'O') {
                dfs( r, COLS - 1,board);
            }
        }

        for (int c = 0; c < COLS; c++) {
            if (board[0][c] == 'O') {
                dfs( 0, c,board);
            }
            if (board[ROWS - 1][c] == 'O') {
                dfs( ROWS - 1, c,board);
            }
        }

        for(int i=0;i<ROWS;++i){
            for(int j=0;j<COLS;++j){
                if(board[i][j]=='O')
                board[i][j]='X';
                else if(board[i][j]=='U')
                board[i][j]='O';
            }
        }
    }
    public static void dfs(int r,int c,char[][]board){
        
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!='O')
        return;
        System.out.println(r+" "+c);
        board[r][c]='U';
        dfs(r-1, c, board);
        dfs(r, c+1, board);
        dfs(r+1, c, board);
        dfs(r, c-1, board);
    }
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        solve(board);
        for(char[]c:board){
            for(char ch:c)
            System.out.print(ch+" ");
            System.out.println();
        }
        
    }
}
