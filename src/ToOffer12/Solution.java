package ToOffer12;

public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null)
            return false;
        int height = board.length;
        int width = board[0].length;
        int[][] mark = new int[height][width];
        int cur = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == word.charAt(cur)) {
                    mark[i][j]++;
                    if (cur == word.length() - 1 || searchAround(i, j, cur + 1, board, mark, word))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean searchAround(int i, int j, int cur, char[][] board, int[][] mark, String word) {
        //上下左右
        int[] dx = {-1, 1, -0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int count = 0; count < dx.length; count++) {
            int newX = i + dx[count];
            int newY = j + dy[count];
            if (newX < board.length && newX >= 0 && newY < board[0].length && newY >= 0
                    && board[newX][newY] == word.charAt(cur) && mark[newX][newY] == 0) {
                mark[newX][newY] = 1;
                if (cur == word.length() - 1 || searchAround(newX, newY, cur + 1, board, mark, word))
                    return true;
            }
        }
        mark[i][j] = 0;
        return false;
    }
}
