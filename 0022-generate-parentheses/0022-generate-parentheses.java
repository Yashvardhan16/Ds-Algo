class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        helper(list,"",n,0,0);
        return list;
    }
    void helper(List<String> list,String sb,int n,int open,int close){
        if(sb.length()==2*n){
            list.add(sb);
            
        }
        if(sb.length()>2*n) return;
        if(open<n){
            helper(list,sb+'(',n,open+1,close);
        }
         if(open>close){
            helper(list,sb+')',n,open,close+1);
        }
    }
}