class Solution {
    public int reverse(int x) {
        
        int ans =0;
        int temp =x;
        while(temp!=0){
         if(ans>214748364||ans<-214748364) return 0;
                                            

            ans = ans*10+ temp%10;
            temp/=10;
        }
        return ans;
    }
}