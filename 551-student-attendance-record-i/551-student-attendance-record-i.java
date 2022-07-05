class Solution {
    public boolean checkRecord(String s) {
         Map<Character,Integer> map = new HashMap();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
            if(map.containsKey('A') && map.get('A')>1 ) return false;
        int count =1;
        int max =1;
       for(int i=1;i<s.length();i++){
          if(s.charAt(i)=='L' && s.charAt(i)==s.charAt(i-1)){
              count++;
              max = Math.max(max,count);
          }else
           count=1;
       }
        return max<3?true:false;
    
    }
}