class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int start = starting(nums,target);
        int end = ending(nums,target);
        ans[0] = start;ans[1] =end;
        return ans;
    }
    int starting(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        int index=-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            
             if(nums[mid]>=target){
                hi = mid-1;
            }else {
                lo=mid+1;
            }
            if(nums[mid]==target){
                index = mid;
            }
        }
        return index;
    }
     int ending(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
         int index=-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            
            if(nums[mid]<=target){
                lo = mid+1;
            }else {
                hi=mid-1;
            }
            if(nums[mid]==target){
                index = mid;
            }
        }
        return index;
    }
    
}