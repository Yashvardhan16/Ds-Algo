class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  list = new ArrayList();
        helper(list,new ArrayList(),nums);
        return list;
    }
    void helper(List<List<Integer>>  list,List<Integer> res,int[] nums){
        if(res.size()==nums.length)
        list.add(new ArrayList(res));
        
        for(int i=0;i<nums.length;i++){
            if(res.contains(nums[i])) continue;
            res.add(nums[i]);
            helper(list,res,nums);
            res.remove(res.size()-1);
        }
    }
}