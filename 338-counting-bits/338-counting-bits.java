class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] = helper(i);
        }
        return res;
    }
    int helper(int i){
        if(i==0) return 0;
        if(i==1) return 1;
        
        if(i%2==0) return helper(i/2);
        return 1+helper(i/2);
    }
}