class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Map<Integer,Boolean> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        int max =1;
        for(int i:map.keySet()){
            if(map.get(i)==true){
                max = Math.max(max,helper(map,i));
            }
        }
        return max;
    }
    int helper(Map<Integer,Boolean> map,int i){
        int count =1;
       
            while(map.containsKey(i+1)){
                count++;
                i++;
            }
        return count;
    }
}