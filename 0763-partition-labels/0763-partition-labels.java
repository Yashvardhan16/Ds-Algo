class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList();
        Map<Character,Integer> map = new HashMap();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        
        int max =0;
        int prev =0;
        for(int i=0;i<s.length();i++){
            max = Math.max(max,map.get(s.charAt(i)));
            if(max==i){
                list.add(max-prev+1);
                prev = i+1;
            }
        }
        return list;
    }
}