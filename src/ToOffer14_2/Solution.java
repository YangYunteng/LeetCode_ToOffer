package ToOffer14_2;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
    public int cuttingRope(int n) {
        BigInteger[] dp = new BigInteger[n + 1];
        Arrays.fill(dp, BigInteger.valueOf(1));
        for (int i = 3; i < dp.length; i++) {
            for (int j = 1; j < i; j++)
                dp[i] = dp[i].max(BigInteger.valueOf((long) j * (i - j)).max(dp[i - j].multiply(BigInteger.valueOf(j))));
        }
        return dp[n].mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
