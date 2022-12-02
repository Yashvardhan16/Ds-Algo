class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0) return 0;
        int lo =0;
        int hi = nums.length-1;
        if(nums[hi]>nums[0]) return nums[0];
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]>nums[hi]){
                lo = mid+1;
            }else{
                hi =mid;
            }
            
        }
        return nums[lo];
    }
}