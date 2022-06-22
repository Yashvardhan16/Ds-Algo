class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]* nums[i-1];
        }
        //1,1,2,6
        int right_prod = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i] * right_prod;
            right_prod = right_prod*nums[i];
        }
        return ans;
    }
}