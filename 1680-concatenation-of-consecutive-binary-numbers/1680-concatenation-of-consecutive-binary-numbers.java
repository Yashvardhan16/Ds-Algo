class Solution {
    public int concatenatedBinary(int n) {
        long mod = 1000000007;
        long ans =0;
        for(int i=1;i<=n;i++){
            int temp =i;
            while(temp>0){
                temp/=2;
                ans*=2;
            }
            ans = (ans+i)%mod;
        }
        return (int)ans;
    }
}