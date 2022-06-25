class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> list = new ArrayList<>();
        helper(list,k,n,new ArrayList<>(),1);
        return list;
    }
    void helper(List<List<Integer>> list,int k,int n,List<Integer> res,int start){
        
        if(n==0&& res.size()==k){
            list.add(new ArrayList<>(res));
            return;
        }
        
        for(int i=start;i<=9;i++){
            res.add(i);
            helper(list,k,n-i,res,i+1);
            res.remove(res.size()-1);
        }
    }
}