// { Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


 
class Solution
{ 
    // Method to calculate distinct sub-array 
    static int countDistinctSubarray(int arr[], int n) 
    { 
        Set<Integer> set = new HashSet<>();
        for(int i:arr) set.add(i);
        int count = set.size();
        Map<Integer,Integer> map = new HashMap<>();
        int ans =0;
        int left =0;
        int right =0;
        for(;right<n;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>=count && left<=right){
                ans += n-right;
                map.put(arr[left],map.getOrDefault(arr[left],0)-1);
                if(map.get(arr[left])==0)
                map.remove(arr[left]);
                left++;
            }
        }
        return ans;
    }
}


// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    Solution ob=new Solution();
		    int ans=ob.countDistinctSubarray(a,n);
		    System.out.println(ans);
		    
		}
	}
}
  // } Driver Code Ends