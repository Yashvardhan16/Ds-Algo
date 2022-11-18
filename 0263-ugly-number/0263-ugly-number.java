class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int[] divisors = new int[3];
        divisors[0] = 2;
        divisors[1] =3;
        divisors[2] =5;
        
        for(int i:divisors){
            while(n%i==0){
                n/=i;
            }
        }
        return n==1;
    }
}