class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int[] dp = new int[list.size()+1];
        
        for(int i=list.size()-1;i>=0;i--){
            for(int j=0;j<list.get(i).size();j++){
                dp[j] = Math.min(dp[j],dp[j+1]) + list.get(i).get(j);
            }
        }
        return dp[0];
     }
}