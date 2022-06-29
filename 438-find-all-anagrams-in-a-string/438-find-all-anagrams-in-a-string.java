class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList();
        int n = s.length();
        int m = p.length();
        if(m>n) return list;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i=0;i<m;i++){
            count1[s.charAt(i)-'a']++;
            count2[p.charAt(i)-'a']++;
        }
        
        if(Arrays.equals(count1,count2)) list.add(0);
        
        for(int i=m;i<n;i++){
        count1[s.charAt(i) -'a']++;
        count1[s.charAt(i-m) -'a']--;
        if(Arrays.equals(count1,count2)) { list.add(i-m+1);}
        }
        return list;
    }
}