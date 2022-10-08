class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0]+nums[1]+nums[nums.length-1];
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int curr = nums[i]+nums[j]+nums[k];
                if(curr>target)k--;
                else j++;
                
                if(Math.abs(closest-target)>Math.abs(curr-target)){
                    closest = curr;
                }
            }
        }
        return closest;
    }
}