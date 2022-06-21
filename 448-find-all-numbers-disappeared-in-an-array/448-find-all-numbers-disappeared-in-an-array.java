class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            set.add(i+1);
        }
        
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
        }
        for(int i:set){
            list.add(i);
        }
        return list;
    }
}