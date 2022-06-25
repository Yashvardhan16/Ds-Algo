class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        int max =0;
        for(char c:tasks){
            count[c-'A']++;
            max =Math.max(max,count[c-'A']);
        }
        int maxcount =0;
        for(int i:count){
            if(i==max){
                maxcount++;
            }
        }
        return Math.max(tasks.length,(n+1)*(max-1)+maxcount);
    }
}