class Solution {
    public int findPeakElement(int[] nums) {
        int index =-1;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                index=i;
            }
        }
        if(index==-1){
         index = nums[nums.length-1]>nums[0]?nums.length-1:0;   
        }
        return index;
    }
}