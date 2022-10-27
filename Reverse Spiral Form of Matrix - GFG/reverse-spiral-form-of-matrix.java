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
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
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
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        int rowb=0;
        int rowe=R-1;
        int colb=0;
        int cole=C-1;
        
        while(rowb<=rowe && colb<=cole){
            for(int i=colb;i<=cole;i++){
                list.add(a[rowb][i]);
            }
            rowb++;
            for(int i=rowb;i<=rowe;i++){
                list.add(a[i][cole]);
            }
            cole--;
        
        
        if(rowb<=rowe){
            for(int i=cole;i>=colb;i--){
                list.add(a[rowe][i]);
            }
            rowe--;
        }
          if(colb<=cole){
            for(int i=rowe;i>=rowb;i--){
                list.add(a[i][colb]);
            }
            colb++;
        }
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            res.add(list.get(i));
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
       
      
}