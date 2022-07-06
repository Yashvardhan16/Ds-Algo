// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String s) {
        // code here
         ArrayList<ArrayList<String>> list = new ArrayList<>();
        helper(list,new ArrayList<>(),s,0);
        return list;
    }
  static  void helper(ArrayList<ArrayList<String>> list,ArrayList<String> res,String s,int start){
        if(s.length()==0){
            list.add(new ArrayList<>(res));
        }
        
        for(int i=0;i<s.length();i++){
            if(isvalid(s.substring(0,i+1))){
                res.add(s.substring(0,i+1));
                helper(list,res,s.substring(i+1),i);
                res.remove(res.size()-1);
            }
        }
    }
 static   boolean isvalid(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}