class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap();
        for(int i=0;i<s.length;i++){
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            String use = new String(c);
            if(!map.containsKey(use)){
                map.put(use,new ArrayList<>());
            }
            map.get(use).add(s[i]);
        }
          list.addAll(map.values());
        return list;
    }
}