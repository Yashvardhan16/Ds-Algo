// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   static String ans;
    public String longestPalin(String S){
        // code here
        ans=S.substring(0,1);
        for(int i=0;i<S.length();i++)
        {
            isPalindrom(S,i,i);
            isPalindrom(S,i,i+1);
        }
        return ans;
    }
    public void isPalindrom(String S,int head,int tail)
    {
        String a=S.substring(0,1);
        while(head>-1 && tail<S.length())
         {
            if(S.charAt(head)!=S.charAt(tail))
             break;
            a=S.substring(head,tail+1);
            tail++;
            head--;
         }
        if(ans.length()<a.length())
          ans=a;
    }
}