class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
            int m= board[0].length;
        
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0) && function(board,i,j,0,word)) return true;
            }
        }
        return false;
    }
    
    boolean function(char[][] board,int i,int j,int start,String word){
        if(start==word.length()) return true;
        if(i<0||j<0||i>board.length-1||j>board[0].length-1||board[i][j]!=word.charAt(start)) {return false;}
        
        char temp = board[i][j];
        board[i][j] = '*';
        boolean dup = function(board,i+1,j,start+1,word)||function(board,i-1,j,start+1,word)||function(board,i,j+1,start+1,word)||function(board,i,j-1,start+1,word);
        board[i][j] = temp;
        return dup;
        
    }
}