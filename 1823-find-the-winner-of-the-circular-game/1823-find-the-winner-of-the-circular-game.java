class Solution {
    public int findTheWinner(int n, int k) {
        int safe_pos=1;
        for(int i=1;i<=n;i++){
            safe_pos = (safe_pos+k-1)%i+1;
        }
        return safe_pos;
    }
}