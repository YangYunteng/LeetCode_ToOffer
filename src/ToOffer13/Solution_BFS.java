package ToOffer13;

import java.util.LinkedList;

public class Solution_BFS {
    public int movingCount(int m, int n, int k) {
        int res = 0;
        boolean[][] visited = new boolean[m][n];
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()) {
            //pop 和 poll 都是将队列第一个元素取出，并删除，区别在于
            //队列为空时，pop 会抛出异常
            //poll 会返回null
            int[] temp = queue.poll();
            int i = temp[0], j = temp[1];
            if (i < 0 || i >= m || j < 0 || j >= n || digitSum(i, j) > k || visited[i][j])
                continue;
            visited[i][j] = true;
            res++;
            queue.add(new int[]{i + 1, j});
            queue.add(new int[]{i, j + 1});
        }
        return res;
    }

    public int digitSum(int x, int y) {
        return x % 10 + x / 10 + y % 10 + y / 10;
    }
}
