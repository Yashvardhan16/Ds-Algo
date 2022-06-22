class Solution {
    public int maxTurbulenceSize(int[] nums) {
      if(nums.length<2) return nums.length;
       int n = nums.length;
       int up=1;
       int down =1;
       int max =1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                up = down+1;
               down =1;
            }
          else  if(nums[i]<nums[i-1]){
                down = up+1;
                 up=1;
            }else{
                up =1;
                down=1;
            }
            max = Math.max(max,Math.max(up,down));
        }
return max;

    }
}