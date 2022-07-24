class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo=0;
        int hi = n-1;
        
        while(lo<hi){
            int mid = (hi+lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>nums[hi]) lo = mid+1;
            else hi = mid;
        }
        
        int start =lo;
        lo=0;
        hi = n-1;
        
        if(target>=nums[start] && target<=nums[hi]){
            lo = start;
        }else {
            hi = start;
        }
        
        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                hi = mid-1;
            }
                else{
                    lo=mid+1;
                }
        }
        return -1;
    }
}