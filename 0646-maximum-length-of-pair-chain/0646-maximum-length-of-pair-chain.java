class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int count =1;
        int[] curr = pairs[0];
        for(int i[]:pairs){
            if(curr[1]<i[0]){
                count++;

                curr =i;
            }
        }
        return count;
    }
}