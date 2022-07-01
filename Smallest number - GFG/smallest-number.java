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
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.smallestNumber(S,D));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String smallestNumber(int s, int d){
        // code here
        if(s==0||s>9*d) return "-1";
        s-=1;
        int[] ans = new int[d];
        for(int i = d-1;i>0;i--){
            if(s>9){
                ans[i] = 9;
                s-=9;
            }else{
                ans[i] = s;
                s=0;
            }
        }
        ans[0] = s+1;
        StringBuilder sb = new StringBuilder();
        for(int i :ans){
            sb.append(i);
        }
        return sb.toString();
    }
}