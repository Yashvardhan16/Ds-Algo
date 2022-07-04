class Solution {
    public int candy(int[] nums) {
        int n  = nums.length;
        int[] ans = new int[n];
     Arrays.fill(ans,1);
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                ans[i] = ans[i-1]+1;
            }
        }
        int sum = ans[ans.length-1];
        
        for(int i=ans.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                ans[i] = Math.max(ans[i],ans[i+1]+1);
            }
            sum+=ans[i];
        }
        return sum;
    }
}