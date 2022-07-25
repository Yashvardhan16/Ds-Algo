class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0) && helper(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean helper(char[][] board,String word,int i,int j,int start){
                if(start==word.length()) return true;

        if(i<0||j<0||i>board.length-1||j>board[0].length-1||board[i][j]!=word.charAt(start)){
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '*';
        boolean dup = helper(board,word,i-1,j,start+1)||helper(board,word,i+1,j,start+1)||helper(board,word,i,j-1,start+1)||helper(board,word,i,j+1,start+1);
        board[i][j] = temp;
        return dup;
    }
}