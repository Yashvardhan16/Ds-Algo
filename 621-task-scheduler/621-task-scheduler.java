class Solution {
    public int leastInterval(char[] tasks, int n) {
         int[] count = new int[26];
        int max = 0;

        for (char i : tasks) {
            count[i-'A']++;
            max = Math.max(max, count[i-'A']);
        }
        int maxcount = 0;
        for (int i : count) {
            if (i == max)
                maxcount++;
        }

        return Math.max(tasks.length,(max-1)*(n+1)+maxcount);
    }
}