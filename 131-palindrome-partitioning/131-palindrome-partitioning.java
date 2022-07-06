class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList();
        helper(list,new ArrayList<>(),s,0);
        return list;
    }
    void helper(List<List<String>> list,List<String> res,String s,int start){
        if(s.length()==0){
            list.add(new ArrayList<>(res));
        }
        
        for(int i=0;i<s.length();i++){
            if(isvalid(s.substring(0,i+1))){
                res.add(s.substring(0,i+1));
                helper(list,res,s.substring(i+1),i);
                res.remove(res.size()-1);
            }
        }
    }
    boolean isvalid(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}