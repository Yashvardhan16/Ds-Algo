class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        
        while(n!=1){
            int temp =n;
            int ans =0;
            while(temp>0){
                ans+=(temp%10)*(temp%10);
                temp/=10;
            }
            if(set.contains(ans)) return false;
            set.add(ans);
            n=ans;
        }
        return true;
    }
}