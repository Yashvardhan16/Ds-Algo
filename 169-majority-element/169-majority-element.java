class Solution {
    public int majorityElement(int[] nums) {
        int max =0;
        int count =0;
        for(int i:nums){
            if(count==0){
                max =i;
            }
             if(i==max){
                count++;
            }else{
                count--;
            }
        }
        return max;
    }
}