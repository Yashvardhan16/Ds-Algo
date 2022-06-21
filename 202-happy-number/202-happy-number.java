class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        while(n!=1){
            int curr =n;
               int ans =0;
            while(curr>0){
            ans += (curr%10) * (curr%10);
            curr/=10;
            }
            if(set.contains(ans)) return false;
            set.add(ans);
               n = ans;

        }
         
        
        return true;
    }
}