class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList();
        helper(list,s,new ArrayList());
        return list;
    }
    void helper(List<List<String>> list ,String s, List<String> res){
         if(s.length()==0){
            list.add(new ArrayList<>(res));
        }
        for(int i=0;i<s.length();i++){
            if(isValid(s.substring(0,i+1))){
                res.add(s.substring(0,i+1));
                helper(list,s.substring(i+1),res);
                res.remove(res.size()-1);
            }
        }
    }
        
        boolean isValid(String s){
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
    
}