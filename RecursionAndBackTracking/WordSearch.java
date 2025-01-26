package RecursionAndBackTracking;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        boolean[][]visited=new boolean[board.length][board[0].length];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (backtrack(board, visited, r, c, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean backtrack(char[][] board, boolean[][] visited, int r, int c, int index, String word) {
        if (index == word.length()) {
            return true;
        }
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || visited[r][c] || board[r][c] != word.charAt(index)) {
            return false;
        }
        visited[r][c] = true;
        boolean res = backtrack(board, visited, r - 1, c, index + 1, word) ||
                      backtrack(board, visited, r + 1, c, index + 1, word) ||
                      backtrack(board, visited, r, c - 1, index + 1, word) ||
                      backtrack(board, visited, r, c + 1, index + 1, word);
        visited[r][c] = false;
        return res;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word="ABCCED";
        System.out.println(exist(board, word));
        
    }
}
