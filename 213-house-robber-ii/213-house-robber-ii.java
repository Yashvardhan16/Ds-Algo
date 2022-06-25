class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        return Math.max(aregatugozaimais(nums,0,nums.length-1),aregatugozaimais(nums,1,nums.length));
    }
    int aregatugozaimais(int[] nums, int start, int end){
        int max =0;
        int prevone =0;
        int prevtwo =0;
        
        for(int i=start;i<end;i++){
            max = Math.max(prevone,prevtwo+nums[i]);
            prevtwo = prevone;
            prevone = max;
        }
        return max;
    }
}