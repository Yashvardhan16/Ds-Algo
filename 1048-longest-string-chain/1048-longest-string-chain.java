class Solution {
    public int longestStrChain(String[] words) {
      Arrays.sort(words , (a,b) -> a.length()-b.length());
        Map<String,Integer> map = new HashMap();
        int ans =0;
        for(String word:words){
            int longest =0;
            for(int i=0;i<word.length();i++){
 String predecessor = word.substring(0,i)+word.substring(i+1,word.length());
 longest = Math.max(longest,map.getOrDefault(predecessor,0)+1);
            }
            map.put(word,longest);
        ans = Math.max(ans,longest);
        }
       return ans;
    }
}