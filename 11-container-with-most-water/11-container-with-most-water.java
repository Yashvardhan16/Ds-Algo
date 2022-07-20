class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int left =0;
        int right = n-1;
        int max =0;
        for(int i=0;i<n;i++){
            max = Math.max(max,(right-left)*Math.min(nums[left],nums[right]));
            
            if(nums[left]<nums[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}