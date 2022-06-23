class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
                if(n==0) return list;
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        list.add(curr);
        
        for(int i=1;i<n;i++){
            List<Integer> prev = list.get(i-1);
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}