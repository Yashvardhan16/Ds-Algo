class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList();
        helper(candidates,list,new ArrayList(),target,0);
        return list;
    }
    void helper(int[] candidates, List<List<Integer>> list ,List<Integer> res,int target,int start){
        
        if(target==0){
            list.add(new ArrayList(res));
        }
        if(target<0) return;
        
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            // if(target-candidates[i]<0) break;
            res.add(candidates[i]);
            helper(candidates,list,res,target-candidates[i],i+1);
            res.remove(res.size()-1);
        }
    }
}