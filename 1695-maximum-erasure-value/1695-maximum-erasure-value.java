class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        if(nums.length==0) return 0;
        int n = nums.length;
        Set<Integer> set = new HashSet();
        int right =0;
        int left =0;
        int sum =0;
        int max =0;
        while(left<n && right<n){
            if(!set.contains(nums[right])){
                sum+=nums[right];
                max = Math.max(max,sum);
                set.add(nums[right]);
                right++;
                 }
            
           else if(set.contains(nums[left])){
               sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return max;
    }
}