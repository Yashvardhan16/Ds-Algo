class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int steps =0;
        int count=0;
        int last_index=0;
        for(int i=0;i<n-1;i++){
           steps = Math.max(steps,nums[i]+i);
            if(i==last_index){
                count++;
                last_index=steps;
            }
        }
        return count;
    }
}