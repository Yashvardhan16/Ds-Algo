class Solution {
    public List<String> wordBreak(String s, List<String> dict) {
        List<String> res = new ArrayList();
        helper(s,dict,res,"");
        return res;
    }
    void helper(String s,List<String> dict,List<String> res,String temp ){
        if(s.length()==0){
            res.add(temp.substring(1));
        }
        for(int i=1;i<=s.length();i++){
            if(dict.contains(s.substring(0,i))){
                helper(s.substring(i),dict,res,temp +" "+ s.substring(0,i));
            }
        }
    }
}