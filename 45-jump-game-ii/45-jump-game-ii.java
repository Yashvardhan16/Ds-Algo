class Solution {
    public int jump(int[] nums) {
        int count =0;
        int steps = 0;
        int lastindex =0;
        
        for(int i=0;i<nums.length-1;i++){
            steps = Math.max(steps,nums[i]+i);
            
            if(i==lastindex){
                count++;
                lastindex=steps;
            }
        }
        return count;
    }
}