// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t>0)
		{
		    String s = sc.next();
		    
		    Solution T = new Solution();
		    System.out.println(T.fun(s));
		    
		    t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int fun(String s)
    {
        // Write your code here
        int n = s.length();
        long a =0;
        long ab =0;
        long abc =0;
        long mod = 1000000007;
        
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            
            if(c=='a'){
                a = (2*a+1)%mod;
            }
            else if(c=='b'){
                ab = (2*ab+a)%mod;
            }
            else{
                abc = (2*abc+ab)%mod;
            }
        }
        return (int)abc;
        
    }
}