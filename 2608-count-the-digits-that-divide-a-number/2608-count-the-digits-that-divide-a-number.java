class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;
        while (num > 0) {
            int k = num % 10;
            if (k != 0 && n % k == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}