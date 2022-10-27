class Solution {
    public int strStr(String s1, String s2) {
        if(s1.length()==0||s2.length()==0) return 0;
        if(!s1.contains(s2)) return -1;
        
        for(int i=0;i<s1.length()-s2.length()+1;i++){
            
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i+j)!=s2.charAt(j)) break;
            else if(j==s2.length()-1) return i;
        }
        }
        return -1;
    }
}