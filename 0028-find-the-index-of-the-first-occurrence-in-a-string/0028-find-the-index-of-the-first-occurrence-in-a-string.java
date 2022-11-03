class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0||haystack.length()==0) return -1;
        if(!haystack.contains(needle)) return -1;
        if(needle.length()>haystack.length()) return -1;
        if(needle.equals(haystack)) return 0;
        
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            int index =0;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                   index++;
                }
                if(index==needle.length()) return i;
            }
            index=0;
            
        }
        return -1;
    }
}