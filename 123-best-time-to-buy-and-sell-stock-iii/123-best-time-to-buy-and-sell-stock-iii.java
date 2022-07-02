class Solution {
    public int maxProfit(int[] nums) {
        if(nums.length==0) return 0;
        int fb = Integer.MIN_VALUE,sb = Integer.MIN_VALUE;
        int fs=0,ss=0;
        
        for(int i=0;i<nums.length;i++){
            fb =Math.max(fb,-nums[i]);
            fs = Math.max(fs,fb+nums[i]);
            sb = Math.max(sb,fs-nums[i]);
            ss = Math.max(ss,sb+nums[i]);
        }
        return ss;
    }
}