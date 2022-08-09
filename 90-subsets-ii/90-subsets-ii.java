class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList();
        helper(list,new ArrayList<>(),nums,0);
       
        return list;
    }
    void helper(List<List<Integer>> list,List<Integer> res ,int[] nums,int start){
        list.add(new ArrayList<>(res));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            res.add(nums[i]);
            helper(list,res,nums,i+1);
            res.remove(res.size()-1);
            
        }
    }
}