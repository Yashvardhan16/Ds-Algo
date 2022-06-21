class Solution {
    public int findMaximumXOR(int[] nums) {
        if(nums.length==0) return 1;
        int result = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
             Set<Integer> set = new HashSet<>();
            for (int n : nums) {
                set.add(n & mask);
            }
            int temp = result | (1 << i);
            for (int it : set) {
                if (set.contains(it ^ temp)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    
    }
}