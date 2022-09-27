class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
       for(int i=0;i<n;i++){
           int val = Math.abs(nums[i]);
           // val--;
           if(nums[val]<0) return Math.abs(nums[i]);
           else nums[val] = -nums[val];
       } 
        return -1;
    }
}