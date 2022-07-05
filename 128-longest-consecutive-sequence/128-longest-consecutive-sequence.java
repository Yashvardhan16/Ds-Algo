class Solution {
    public int longestConsecutive(int[] nums) {
          Set<Integer> set = new HashSet();
        for(int i:nums){
            set.add(i);
        }
        int max_seq_length=0;
        for(int i=0;i<nums.length;i++){
            int currnums = nums[i];
            int currlength=1;
            if(!set.contains(currnums-1)){
                while(set.contains(currnums+1)){
                    currnums+=+1;
                    currlength +=1;
                }
            }
            max_seq_length = Math.max(max_seq_length,currlength);
        }
        return max_seq_length;
    }
}