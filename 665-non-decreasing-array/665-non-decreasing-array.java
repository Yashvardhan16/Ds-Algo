class Solution {
    public boolean checkPossibility(int[] nums) {
int count =0;
        for(int i=1,prev=nums[0];i<nums.length;i++){
            if(prev>nums[i]){
                if(count++>0) return false;
            if(i-2>=0 && nums[i-2]>nums[i]) continue;
            }
            prev = nums[i];
        }
        return true;
    }
}