class Solution {
    public boolean isMonotonic(int[] nums) {
        int i =1;
        while(i<nums.length){
            if(nums[i]>=nums[i-1]){
                i++;
            }else{
                break;
            }
        }
        int j =nums.length-2;
        while(j>=0){
            if(nums[j]>=nums[j+1]){
                j--;
            }else break;
        }
        System.out.println(j);
        return i==nums.length||j==-1;
    }
}