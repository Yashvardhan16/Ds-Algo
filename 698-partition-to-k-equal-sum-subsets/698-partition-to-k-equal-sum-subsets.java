class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
              if (nums.length < k)
            return false;
        int n = nums.length;
        int total = 0;
       if(k<=0) return false;
        for (int i : nums) {
            total += i;
        }
        if (total % k != 0)
            return false;
        int subsetsum = total / k;
        boolean[] visited = new boolean[n];
        return helper(nums, k, 0, visited, 0, subsetsum);
    }
    boolean helper(int[] nums, int k, int start, boolean[] visited, int currsum, int subsetsum) {
        if (k == 0)
            return true;
        if (currsum > subsetsum)
            return false;
        if (currsum == subsetsum) {
            return helper(nums, k - 1, 0, visited, 0, subsetsum);
        }

        for (int i = start; i < nums.length; i++) {
            if (!visited[i]){
                
            visited[i] = true;
            if (helper(nums, k, i + 1, visited, currsum + nums[i], subsetsum))
                return true;
            visited[i] = false;
        }
        }
        return false;
    }
}
    
