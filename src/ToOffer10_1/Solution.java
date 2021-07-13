package ToOffer10_1;

public class Solution {
    //0
    //1
    //1
    //2
    //3
    //5
    public int fib(int n) {
            final int delivery = 1000000007;
            if (n == 0 || n == 1)
                return n;
            int temp1 = 0;
            int temp2 = 1;
            for (int i = 2; i <= n; i++) {
                int temp = temp2 % delivery;
                temp2 = temp1 % delivery + temp;
                temp1 = temp;
            }
            return temp2 % delivery;
    }
}
