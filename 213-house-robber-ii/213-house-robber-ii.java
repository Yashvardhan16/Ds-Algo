class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        return Math.max(ans(nums,0,n-1),ans(nums,1,n));
    }
    
    int ans(int[] nums,int start,int end){
        int max =0,prevone=0,prevtwo=0;
        
        for(int i=start;i<end;i++){
            max = Math.max(prevone,prevtwo+nums[i]);
            prevtwo=prevone;
            prevone=max;
        }
        return max;
    }
}