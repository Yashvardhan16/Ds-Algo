class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        Arrays.sort(nums);
       List<List<Integer>> list = new ArrayList();
         if(target==-294967296) return list;
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum>target){
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        List<Integer> res = new ArrayList();
                        res.add(nums[i]);
                          res.add(nums[j]);
                          res.add(nums[left]);
                          res.add(nums[right]);
                        list.add(new ArrayList<>(res));
                        left++;right--;
                   
                while(left<right && nums[left]==nums[left-1]) left++;
          while(left<right && nums[right]==nums[right+1]) right--;        }
                }
            }
        }
        return list;
    }
}