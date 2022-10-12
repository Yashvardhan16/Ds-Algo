//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<n;i++){
            map.put(x[i],b[i]);
        }
        int sum =0,max=Integer.MIN_VALUE,max_st=0,st=0,end=0;
        
        for(int i=0;i<w.length();i++){
            char ch = w.charAt(i);
            int value = (int)ch;
            if(map.containsKey(ch))
                value = map.get(ch);
            
         
            if(sum<0){
                st=i;
                sum =0;
            }
               sum+=value;
            if(sum>max){
                max = sum;
                max_st=st;
                end = i;
            }
            
        }
        return w.substring(max_st,end+1);
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends