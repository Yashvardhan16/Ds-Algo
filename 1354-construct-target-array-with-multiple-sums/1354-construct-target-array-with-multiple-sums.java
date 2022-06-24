class Solution {
    public boolean isPossible(int[] nums) {
       int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        long sum =0;
        for(int i:nums){
            pq.add(i);
            sum+=i;
        }
        
        for(int i: nums){
            int max =pq.poll();
            long remtotal = sum-max;
            
            if(max==1||remtotal==1){
                return true;
            }
            if(remtotal==0||max<remtotal){
                return false;
            }
            int updatedmax = (int)(max%remtotal);
            if(updatedmax==0) return false;
            
            max = updatedmax;
            pq.add(max);
            sum = updatedmax+remtotal;
        }
        return true;
    }
}