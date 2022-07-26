class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList();
        int prev =0;
        int max =0;
        Map<Character,Integer> map = new HashMap();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,i);
        }
        for(int i=0;i<s.length();i++){
           max= Math.max(max,map.get(s.charAt(i)));
            if(i==max){
               list.add(max-prev+1);
                  prev = max+1;
            }
            
            
        }
        return list;
    }
}