class Solution {
    public List<Integer> findLonely(int[] nums) {
       Map<Integer,Integer> map = new HashMap();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+1)||map.containsKey(nums[i]-1)||map.get(nums[i])>1){
                continue;
            }else{
                list.add(nums[i]);
            }
        }
        return list;
    }
}