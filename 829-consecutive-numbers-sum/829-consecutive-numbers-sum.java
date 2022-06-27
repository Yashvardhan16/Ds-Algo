class Solution {
    public int consecutiveNumbersSum(int n) {
         if (n == 0)
            return 1;
        int sum = 0;
        int count =0;
        int len = 1;
        while (sum < n) {
            sum += len;
            if ((n - sum) % len == 0) count++;
            len++;
        }
        return count;
    }
}
    