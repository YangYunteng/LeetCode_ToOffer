package ToOffer11;

public class Solution {
    public int minArray(int[] numbers) {
        if (numbers.length < 1)
            return -1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1])
                return numbers[i + 1];
        }
        return numbers[0];
    }
}
