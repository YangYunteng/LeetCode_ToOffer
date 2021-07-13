package Tooffer10_2;

public class Solution {
    public int numWays(int n) {
        if (n < 2)
            return 1;
        final int delivery = 1000000007;
        int temp1 = 1;
        int temp2 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = temp2 % delivery;
            temp2 = temp1 % delivery + temp;
            temp1 = temp;
        }
        return temp2%delivery;
    }
}
