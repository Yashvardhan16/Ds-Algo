class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quick(nums,0,nums.length-1,k);
    }
    int quick(int[] nums,int low,int high,int k){
        int pivot =low;
        
        for(int i=low;i<high;i++){
            if(nums[i]<=nums[high]){
                swap(nums,pivot++,i);
            }
        }
        swap(nums,pivot,high);
        int count = high-pivot+1;
        if(count==k) return nums[pivot];
        if(count>k) return quick(nums,pivot+1,high,k);
        return quick(nums,low,pivot-1,k-count);
    }
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}