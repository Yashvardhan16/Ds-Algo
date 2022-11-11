class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        
        int slow=1,fast=1;
        
        while(fast<nums.length){
            if(nums[fast]!=nums[slow-1]){
                nums[slow++] = nums[fast];
                
            }
            fast++;
        }
        return slow;
    }
}