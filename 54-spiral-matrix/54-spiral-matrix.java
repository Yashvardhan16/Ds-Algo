class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> list = new ArrayList<>();
        if(matrix.length==0) return list;
        
        int rstart=0;
        int rend = matrix.length-1;
        int cstart=0;
        int cend = matrix[0].length-1;
        while(rstart<=rend && cstart<=cend){
        for(int i=cstart;i<=cend;i++){
            list.add(matrix[rstart][i]);
        }
            rstart++;
            for(int i=rstart;i<=rend;i++){
            list.add(matrix[i][cend]);
        }
            cend--;
            
            if(rstart<=rend){
                for(int i = cend;i>=cstart;i--){
                    list.add(matrix[rend][i]);
                }
            }
            rend--;
            if(cstart<=cend){
                for(int i = rend;i>=rstart;i--){
                    list.add(matrix[i][cstart]);
                }
            }
            cstart++;
            
        }
        return list;
    }
}