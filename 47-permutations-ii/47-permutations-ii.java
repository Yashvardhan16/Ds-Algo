class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        boolean[] vis = new boolean[nums.length];
        helper(list,nums,new ArrayList<>(),vis);
        return list;
    }
    void helper(List<List<Integer>> list ,int[] nums, List<Integer> res, boolean[] vis){
        if(res.size()==nums.length){
            list.add(new ArrayList<>(res));
        }
        if(res.size()>nums.length) return;
        for(int i=0;i<nums.length;i++){
            if(vis[i]||i>0 && nums[i]==nums[i-1] && vis[i-1]) continue;
            vis[i] = true;
            res.add(nums[i]);
            helper(list,nums,res,vis);
            vis[i] = false;
            res.remove(res.size()-1);
        }
    }
}