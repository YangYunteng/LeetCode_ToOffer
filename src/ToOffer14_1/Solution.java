package ToOffer14_1;

public class Solution {
    public int cuttingRope(int n) {
        int[] num = new int[n + 1];
        if (n < 2)
            return 1;
        num[0] = 0;
        num[1] = 1;
        num[2] = 1;
        for (int i = 3; i < num.length; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                max = Math.max(max, Math.max(num[j], j) * (i - j));
            }
            num[i] = max;
        }
        return num[n];
    }
}
