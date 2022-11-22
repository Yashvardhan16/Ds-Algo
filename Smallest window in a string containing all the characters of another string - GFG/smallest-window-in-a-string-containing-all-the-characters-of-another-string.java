//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        int left =0,right=0;
       int[] count = new int[128];
        for(char c:p.toCharArray()){
            count[c]++;
        }
        int min=Integer.MAX_VALUE,head=0;
        int n = p.length();
        while(right<s.length()){
            if(count[s.charAt(right++)]-->0)n--;
            
            while(n==0){
                if(right-left<min){
                    min = right-left;
                    head = left;
                }
            
            if(count[s.charAt(left++)]++ ==0)n++;
            }
        }
        return min==Integer.MAX_VALUE?"-1":s.substring(head,head+min);
    }
}