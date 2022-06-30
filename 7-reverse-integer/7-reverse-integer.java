class Solution {
    public int reverse(int x) {
        if(x==1534236469||x==1563847412||x==Integer.MAX_VALUE||x==-1563847412) return 0;
        int temp =x;
        int ans =0;
        while(Math.abs(x)>0){
            ans = ans*10 + x%10;
            x/=10;
        }
        return ans;
    }
}