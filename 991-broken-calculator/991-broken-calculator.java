class Solution {
    public int brokenCalc(int start, int end) {
        int ans =0;
        while(end>start){
            ans++;
            if(end%2==1){
                end++;
            }else{
                end/=2;
            }
        }
        return ans + start - end;
    }
}