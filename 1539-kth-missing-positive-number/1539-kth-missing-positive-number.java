class Solution {
    public int findKthPositive(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        int max = arr[arr.length-1] +k;
        
        for(int i=1;i<=max;i++){
            pq.add(i);
        }
        
        for(int i:arr){
            pq.remove(i);
        }
        int ans =0;
        for(int i=1;i<=k;i++){
            ans = pq.poll();
        }
        return ans;
    }
}