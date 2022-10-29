class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
      List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        helper(list,new ArrayList(),nums,visited);
        return list;
    }
    void helper(List<List<Integer>> list,List<Integer> res,int[]nums,boolean[] visited){
        if(res.size()==nums.length){
            list.add(new ArrayList<>(res));
        }
        
        for(int i=0;i<nums.length;i++){
            if(visited[i]||i>0 && nums[i]==nums[i-1] && visited[i-1]) continue;
              visited[i] = true;
            res.add(nums[i]);
          
            helper(list,res,nums,visited);
            visited[i] = false;
            res.remove(res.size()-1);
        }
    }
}