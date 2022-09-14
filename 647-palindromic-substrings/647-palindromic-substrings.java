class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count =0;
        for(int i=0;i<n;i++){
            count+=valid(s,i,i)+valid(s,i,i+1);
        }
        return count;
    }
    int valid(String s,int left,int right){
        if(left>right) return 0;
        int count =0;
        while(left>=0&& right<s.length()&& s.charAt(left)==s.charAt(right)) {count++;left--;right++;}
        
        return count;
    }
}