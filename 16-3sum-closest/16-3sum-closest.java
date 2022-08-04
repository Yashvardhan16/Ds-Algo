class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if(n<3) return 0;
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[n-1];
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k =n-1;
            while(j<k){
                int currsum = nums[i]+nums[j]+nums[k];
                if(currsum>target) k--;
            else
                j++;
            
            
            if(Math.abs(currsum-target)<Math.abs(closest-target)){
                closest = currsum;
            }
        }
        }
            
        return closest;
    }
}