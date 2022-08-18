class Solution {
    public int minSetSize(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList();
       list.addAll(map.values());
        Collections.sort(list,Collections.reverseOrder());
        int total =nums.length;
        int count =0;
        int i=0;
        while(total>nums.length/2){
            total-=list.get(i);
            count++;
            i++;
        }
        
       return count;
    }
}