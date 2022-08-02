class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int [] ans =new int[n];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                ans[i] = ans[i] | 1<< (words[i].charAt(j)-'a');
            }
        }
        int sum=0;
        for(int i=0;i<ans.length;i++){
            for(int j=i+1;j<ans.length;j++){
                if((ans[i] & ans[j])==0){
                 sum=Math.max(sum,words[i].length() * words[j].length());   
                }
            }
        }
        return sum;
    }
}