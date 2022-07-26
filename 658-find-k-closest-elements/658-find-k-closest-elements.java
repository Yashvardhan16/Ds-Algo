class Solution {
    public List<Integer> findClosestElements(int[] nums,int k,int x) {
        List<Integer> list =  new ArrayList();
        int lo=0;
        int hi = nums.length-1;
        while(hi-lo>=k){
            int distlow = Math.abs(nums[lo]-x);
            int disthigh = Math.abs(nums[hi]-x);
            
            if(distlow<=disthigh) hi--;
            else lo++;
        }
        while(lo<=hi){
            list.add(nums[lo]);
            lo++;
        }
        return list;
    }
}