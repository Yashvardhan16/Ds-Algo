class Solution {
    public List<List<String>> groupAnagrams(String[] nums) {
        List<List<String>> list = new ArrayList();
                Map<String,List<String>> map = new HashMap();
        int n = nums.length;
        for(int i=0;i<n;i++){
            char[] ch= nums[i].toCharArray();
            Arrays.sort(ch);
            String use = new String(ch);
    
           if(!map.containsKey(use)){
            map.put(use,new ArrayList<>());
            }
            map.get(use).add(nums[i]);
            
        }
        list.addAll(map.values());
        return list;
    }
}