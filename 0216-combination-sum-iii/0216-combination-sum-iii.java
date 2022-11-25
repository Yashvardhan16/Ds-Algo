class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList();
        helper(list,new ArrayList(),k,n,1);
        return list;
    }
    void helper(List<List<Integer>> list,List<Integer> res ,int k,int n,int curr){
       
        if(res.size()==k && n==0){
            list.add(new ArrayList(res));
        }
        if(res.size()>k||n<0) return;
        
        for(int i=curr;i<=9;i++){
            res.add(i);
            helper(list,res,k,n-i,i+1);
            res.remove(res.size()-1);
        }
    }
}