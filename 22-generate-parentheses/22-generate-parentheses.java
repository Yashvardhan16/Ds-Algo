class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        helper(ans,"",0,0,n);
        return ans;
    }
    void helper(List<String> ans,String temp,int open,int close,int n){
        if(temp.length()==2*n){
            ans.add(temp);
            return;
        }
        
        if(open<n){
            helper(ans,temp+'(',open+1,close,n);
        }
        if(close<open){
            helper(ans,temp+')',open,close+1,n);
        }
    }
}