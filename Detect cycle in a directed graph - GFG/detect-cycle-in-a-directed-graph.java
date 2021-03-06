// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] vis = new boolean[v];
        boolean[] recs = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfs(vis,adj,i,recs)) return true;
            }
        }
        return false;
    }
    boolean dfs(boolean[] vis ,ArrayList<ArrayList<Integer>> adj,int v,  boolean[] recs ){
        vis[v] = true;
        recs[v]  = true;
        for(Integer neighbor:adj.get(v)){
            if(!vis[neighbor]){
                if(dfs(vis,adj,neighbor,recs))return true;
            }else if(recs[neighbor]){
                return true;
            }
        }
        recs[v] = false;
        return false;
    }
}