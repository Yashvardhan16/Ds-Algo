class Solution {
    public int minPartitions(String s) {
        int max =0;
        for(int i=0;i<s.length();i++){
            max = Math.max(max,s.charAt(i)-'0');
        }
        return max;
    }
}