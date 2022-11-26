class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> min = new PriorityQueue();
        PriorityQueue<Integer> max = new PriorityQueue(Collections.reverseOrder());
        
        int ans =0;
        int left=0,right=0;
        while(right<nums.length){
            min.add(nums[right]);
            max.add(nums[right]);
            while(Math.abs(max.peek()-min.peek())>limit){
                min.remove(nums[left]);
                max.remove(nums[left]);
               
                left++;
            }
           ans = Math.max(ans,right-left+1);

            right++;
        }
        return ans;
    }
}