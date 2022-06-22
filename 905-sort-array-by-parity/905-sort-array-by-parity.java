class Solution {
    public int[] sortArrayByParity(int[] nums) {
         int even_index =0; 
        int odd_index =nums.length-1;
        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[even_index++] = nums[i];
            }else{
                ans[odd_index--] = nums[i]; 
            }
        }
        
        
        
        return ans;
    }
}