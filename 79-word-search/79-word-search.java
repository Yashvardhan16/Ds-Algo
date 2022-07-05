class Solution {
    public boolean exist(char[][] a, String word) {
        int n = a.length;
        int m = a[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==word.charAt(0) && helper(a,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean helper(char[][] a,String word,int i,int j,int start){
        if(start==word.length()) return true;
 if(i<0||j<0||i>a.length-1||j>a[0].length-1||a[i][j]!=word.charAt(start)){
            return false;
        }
        
        char temp = a[i][j];
        a[i][j] = '*';
       boolean dup= helper(a,word,i+1,j,start+1) || helper(a,word,i-1,j,start+1)||
         helper(a,word,i,j+1,start+1)||
         helper(a,word,i,j-1,start+1);
      a[i][j]=  temp ;
        return dup;
    }
}