class Solution {
    public void sortColors(int[] nums) {
        int index =0;
        int lo=0;
        int hi = nums.length-1;
        while(index<=hi){
            if(nums[index]==2){
                nums[index] =nums[hi];
                nums[hi] = 2;
                hi--;
                index--;
                
            }else if(nums[index]==0)
            {
                nums[index] = nums[lo];
                nums[lo] =0;
                lo++;
            }
            index++;
        }
    }
}