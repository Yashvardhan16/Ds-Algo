class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        helper(list,new ArrayList(),0,nums);
        return list;
    }
    void helper( List<List<Integer>> list,List<Integer> res,int start,int[] nums){
        list.add(new ArrayList(res));
        
        for(int i=start;i<nums.length;i++){
            res.add(nums[i]);
            helper(list,res,i+1,nums);
            res.remove(res.size()-1);
        }
    }
}