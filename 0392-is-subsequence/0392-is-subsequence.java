class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) return true;
        if(s.length()==0 && t.length()==0) return true;
        if(s.length()==0 && t.length()!=0) return true;
         if(s.length()!=0 && t.length()==0) return false;
        
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<t.length();i++){
             if(sb.charAt(0)==t.charAt(i) && sb.length()==1){
                return true;
            }
           else  if(sb.charAt(0)==t.charAt(i) && sb.length()>1){
                sb.deleteCharAt(0);
            }
        }
        return sb.length()==0;
    }
}