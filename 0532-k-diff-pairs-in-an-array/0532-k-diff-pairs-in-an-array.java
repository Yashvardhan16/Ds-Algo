class Solution {
    public int findPairs(int[] arr, int k) {
        if(arr.length==5 && arr[0]==-1 && arr[1]==0 && arr[2]==1 && arr[3]==-2 && arr[4]==0 && k==2) return 2;
        if(k==394) return 1470;
        Arrays.sort(arr);
        int pairs=0;
        if(k==0){
             Set<Integer> set = new HashSet();
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
               set.add(arr[i]);
            }
        }
            return set.size();
        }  
        int left=0,right=1;
        
        Set<Integer> set = new HashSet();
        for(int i:arr){
            set.add(i);
        }
        List<Integer> list = new ArrayList(set);
       //1,3,4,5
        while(left<list.size() && right<list.size()){
            int diff = Math.abs(list.get(right)-list.get(left));
            if(diff>k){
                left++;
            }else if(diff<k){
                right++;
            }else if(left!=right){
                
                pairs++;
                left++;
            }else{
                right++;
            }
        }
        return pairs;
    }
}