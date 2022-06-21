// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.optimalKeys(N));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int optimalKeys(int n){
        if(n<7) return n;
        int[] dp = new int[n+1];
for(int i=0;i<=6;i++){
    dp[i] = i;
}
        for(int i=7;i<=n;i++){
            dp[i] = Math.max(2*dp[i-3],Math.max(3*dp[i-4],4*dp[i-5]));
        }
return dp[n];
    }
}