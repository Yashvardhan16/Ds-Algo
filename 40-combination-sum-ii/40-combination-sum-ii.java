class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int k) {
         Arrays.sort(nums);
        List<List<Integer>>  list = new LinkedList();
        helper(list,new ArrayList<>(),nums,k,0);
        return list;
    }
    void helper(  List<List<Integer>>  list ,List<Integer> res ,int[] nums, int k,int start){
        if(k<0) return;
        
        if(k==0){
            list.add(new ArrayList<>(res));
            return;
        }
        
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            if(k-nums[i]<0) break;
            res.add(nums[i]);
            helper(list,res,nums,k-nums[i],i+1);
            res.remove(res.size()-1);
        }
    }
}