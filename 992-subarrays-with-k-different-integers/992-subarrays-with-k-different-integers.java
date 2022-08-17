class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    int helper(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap();
        int left=0;
        int len=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            
            while(map.size()==k+1){
                 map.put(nums[left],map.get(nums[left])-1);
  
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            len+=right-left+1;
        }
        return len;
    }
}