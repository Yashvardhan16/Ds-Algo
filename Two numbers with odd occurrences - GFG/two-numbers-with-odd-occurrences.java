//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int n)
    {
        // code here
        Map<Integer,Integer> map = new HashMap();
        
        for(int i:Arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i:map.keySet()){
            if(map.get(i)%2==1){
                pq.add(i);
            }
        }
        int[] ans = new int[pq.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = pq.poll();
        }
        return ans;
    }
}