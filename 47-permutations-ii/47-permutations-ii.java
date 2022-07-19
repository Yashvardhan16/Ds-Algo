class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>  list = new ArrayList();
        Arrays.sort(nums);
        helper(list,new ArrayList(),nums,new boolean[nums.length]);
        return list;
    }
    void helper(List<List<Integer>> list,List<Integer> res,int[] nums,boolean[] used){
        if(res.size()==nums.length){
            list.add(new ArrayList<>(res));
        }
        for(int i=0;i<nums.length;i++){
       if(used[i]||i>0 && nums[i]==nums[i-1] && used[i-1]) continue;
        used[i] = true;
            res.add(nums[i]);
            helper(list,res,nums,used);
            used[i] = false;
            res.remove(res.size()-1);
        }
    }
}