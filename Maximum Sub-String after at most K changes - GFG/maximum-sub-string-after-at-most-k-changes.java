//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int k)
    {
        // code here
        Map<Character,Integer> map = new HashMap();
       int left =0,max=0,right=0,n=s.length();
       int ans =0;
       while(right<n){
           map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
           max = Math.max(max,map.get(s.charAt(right)));
           
           if(right-left+1-max>k){
               map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
               left++;
           }
           ans =Math.max(ans,right-left+1);
           right++;
       }
        return ans;
    }
}