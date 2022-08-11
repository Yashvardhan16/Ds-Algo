class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        List<Integer> list = new ArrayList();
        int lo=0;
        int hi = nums.length-1;
        while(hi-lo>=k){
            int dist_low = Math.abs(nums[lo]-x);
             int dist_high = Math.abs(nums[hi]-x);
            if(dist_low<=dist_high){
                hi--;
            }else
                lo++;
        }
        while(lo<=hi){
            list.add(nums[lo++]);
        }
        return list;
    }
}