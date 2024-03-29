class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);
        int count =0;
      
        for(int i=2;i*i<n;i++){
            
                for(int j=i;j*i<n;j++){
                    primes[i*j] = false;
                }
            
        }
        for(int i=2;i<n;i++){
            if(primes[i])count++;
        }
        return count;
    }
    
}