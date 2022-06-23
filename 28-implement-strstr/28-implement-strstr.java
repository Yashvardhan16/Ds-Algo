class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0||needle.length()==0) return 0;
        if(!haystack.contains(needle)) return -1;
            
        
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(i+needle.length()>haystack.length()) break;
            
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if(j==needle.length()-1){
                    return i;
                }
            }
        }
        
        return -1;
    }
}