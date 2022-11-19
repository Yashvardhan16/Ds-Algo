class Solution {
    int count =0;
    public int countArrangement(int n) {
        if(n<=0) return count;
        boolean[] visited= new boolean[n+1];
        helper(visited,1,n);
        return count;
    }
    void helper(boolean[] visited,int val,int n){
        if(val>n){
            count++;
            return;
        }
        
        for(int i=1;i<=n;i++){
            if(!visited[i] &&(val%i ==0 || i%val==0 )){
                visited[i] = true;
                helper(visited,val+1,n);
                visited[i]= false;
            }
        }
    }
}