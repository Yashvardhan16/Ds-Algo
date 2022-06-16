// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            long ans = ob.countStrings(S); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long countStrings(String s) 
    { 
        // code here
        int[] count = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
        ans += n - count[s.charAt(i) - 'a'];
    }
    
    ans /= 2;
        
        for(int i=0;i<26;i++){
            if(count[i]>1){
                ans++;
                break;
            }
        }
        
        return ans;
    }
}