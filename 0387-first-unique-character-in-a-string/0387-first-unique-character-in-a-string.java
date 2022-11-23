class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map= new HashMap();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int index =-1;
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                index =i;
                break;
            }
        }
        return index;
    }
}