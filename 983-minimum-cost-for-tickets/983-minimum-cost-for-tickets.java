class Solution {
    Integer[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp = new Integer[days.length];
        return helper(days,costs,0);
    }
    int helper(int[] days, int[] costs, int d){
        if(d>=days.length) return 0;
        if(dp[d]!=null) return dp[d];
        int oneday = helper(days,costs,d+1) + costs[0];
        int i=0;
        for( i=d;i<days.length;i++)
            if(days[i]>=days[d]+7){
                break;
            
        }
          int sevenday = helper(days,costs,i) + costs[1];
        for( i=d;i<days.length;i++)
            if(days[i]>=days[d]+30){
                break;
            
        }
                int thirtyday = helper(days,costs,i) + costs[2];

  return  dp[d] = Math.min(oneday,Math.min(sevenday,thirtyday));
    }
}