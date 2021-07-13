package ToOffer13;

public class Solution_DFS {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, k, visited);
    }

    public int dfs(int x, int y, int k, boolean[][] visited) {
        int height = visited.length;
        int width = visited[0].length;
        if (x < 0 || x >= height || y < 0 || y >= width || digitSum(x, y) > k || visited[x][y])
            return 0;
        visited[x][y] = true;
        //上下左右,如果当前格子可以完成，也就意味着上面和左面的格子是一定可以的，所以只需要递归右边和下边
        return 1 + dfs(x + 1, y, k, visited) + dfs(x, y + 1, k, visited);
    }

    public int digitSum(int x, int y) {
        return x % 10 + x / 10 + y % 10 + y / 10;
    }
}
