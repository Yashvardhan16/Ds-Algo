class Solution {
    public int furthestBuilding(int[] nums, int bricks, int ladders) {
        int n = nums.length;
       PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<n-1;i++){
                int diff = nums[i+1]-nums[i];
                if(diff>0){
                pq.add(diff);
                }
                if(pq.size()>ladders){
                    bricks -= pq.poll();
                }
              if(bricks<0){
                  return i;
              }
            }
        return n-1;
    }
}