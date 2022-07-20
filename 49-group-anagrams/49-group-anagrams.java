class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list =new ArrayList();
        Map<String,List<String>> map = new HashMap();
        for(int i=0;i<strs.length;i++){
            String curr = strs[i];
            char[] c = curr.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        list.addAll(map.values());
        return list;
    }
}