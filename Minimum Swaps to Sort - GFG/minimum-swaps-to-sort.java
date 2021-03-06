// { Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int[] a =Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(a);
        int count =0;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<a.length;i++){
            map.put(a[i],i);
        }
        for(int i=0;i<nums.length;i++){
            while(map.get(nums[i])!=i){
                count++;
                int temp = nums[i];
                nums[i] = nums[map.get(temp)];
                nums[map.get(temp)] =temp;
            }
        }
        return count;
    }
}