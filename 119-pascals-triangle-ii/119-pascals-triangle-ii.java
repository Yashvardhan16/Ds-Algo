class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList();
        row.add(1);
         if(n==0) {
             
             return row;
         } 
        
        for(int i=1;i<n+1;i++){
            for(int j=row.size()-1;j>0;j--){
                row.set(j,row.get(j-1)+row.get(j));
            }
            row.add(1);
            
        }
        return row;
    }
}