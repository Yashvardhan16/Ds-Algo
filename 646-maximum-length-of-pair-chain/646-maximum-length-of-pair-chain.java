class Solution {
    public int findLongestChain(int[][] blocks) {
         if(blocks.length==0) return 0;
        Arrays.sort(blocks, (a, b) -> a[1] - b[1]);
        int max = 1;
        int curr = blocks[0][1];
        int count =1;
       for(int i=1;i<blocks.length;i++){
           if(blocks[i][0]>curr){
               count++;
               curr = blocks[i][1];
           }
       }
       
        return count;
    }
}