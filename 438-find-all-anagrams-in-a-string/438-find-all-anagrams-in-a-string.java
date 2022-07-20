class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
         List<Integer> list = new ArrayList();
        if(s.length()<p.length()) return list;
        for(int i=0;i<p.length();i++){
            count1[s.charAt(i)-'a']++;
             count2[p.charAt(i)-'a']++;
        }
       
       
        if(Arrays.equals(count1,count2)) list.add(0);
        
        for(int i=p.length();i<s.length();i++){
            count1[s.charAt(i)-'a']++;
            count1[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(count1,count2)) list.add(i-p.length()+1);
        }
        return list;
    }
}