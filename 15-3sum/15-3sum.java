class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet();
        int i=0;
        
        for( i=0;i<nums.length-2;i++){
           int j =i+1;
             int k = nums.length-1;
           
            while(j<k){
                 int sum =nums[j]+nums[k];
            if(sum==-nums[i]){
                List<Integer> res = new ArrayList();
                res.add(nums[i]);
                 res.add(nums[j]);
                 res.add(nums[k]);
                list.add(res);
                j++;k--;
            }else if(sum>-nums[i]){
                k--;
            }else{
                j++;
            }
            }
        }
        return new ArrayList<>(list);
    }
}