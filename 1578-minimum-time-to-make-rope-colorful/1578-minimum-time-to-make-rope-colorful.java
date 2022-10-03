class Solution {
    public int minCost(String s, int[] nums) {
        int sum =0;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                sum+=Math.min(nums[i],nums[i-1]);
                nums[i] = Math.max(nums[i],nums[i-1]);
            }
        }
        return sum;
    }
}