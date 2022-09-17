class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList();
        helper(candidates,list,target,new ArrayList(),0);
        return list;
    }
    void helper(int[] candidates, List<List<Integer>> list,int target,List<Integer> res,int start){
        if(target==0){
            list.add(new ArrayList(res));
        }
        if(target<0) return;
        
        for(int i=start;i<candidates.length;i++){
            res.add(candidates[i]);
            helper(candidates,list,target-candidates[i],res,i);
            res.remove(res.size()-1);
        }
    }
}