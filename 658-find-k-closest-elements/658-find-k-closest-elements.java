class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList();
        int lo=0;
        int hi = arr.length-1;
        
        while(hi-lo>=k){
            int low = Math.abs(arr[lo]-x);
             int high = Math.abs(arr[hi]-x);
            
            if(low<=high){
                hi--;
            }else{
                lo++;
            }
        }
        while(lo<=hi){
            list.add(arr[lo++]);
        }
        return list;
    }
}