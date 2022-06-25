class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums,0,list,new ArrayList<>(),target);
        return list;
    }
    void helper(int[] nums,int start , List<List<Integer>> list, List<Integer> res,int target ){
        if(target<0) return;
        if(target==0){
        list.add(new ArrayList<>(res));
        }
        for(int i=start;i<nums.length;i++){
                res.add(nums[i]);
                helper(nums,i,list,res,target-nums[i]);
                res.remove(res.size()-1);
        }
    }
}
