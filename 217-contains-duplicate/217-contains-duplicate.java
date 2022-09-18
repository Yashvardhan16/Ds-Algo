class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet();
        for(int i:nums){set.add(i);}
        return set.size()==nums.length?false:true;
    }
}