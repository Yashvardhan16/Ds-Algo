class Solution {
    public int numSub(String s) {
         int n =s.length();
        long count =0;
        int seq =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
               seq=0;
            }else{
                count += ++seq;
            }
        }
        return (int)(count%1000000007);
    }
}