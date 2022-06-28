class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer> list = new ArrayList();
        int max =0;
        int prev =0;
        for(int i=0;i<s.length();i++){
            max = Math.max(max,map.get(s.charAt(i)));
            if(i==max){
                list.add(max-prev+1);
                prev =max+1;
            }
        }
        return list;
    }
}