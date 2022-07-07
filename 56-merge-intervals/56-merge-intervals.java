class Solution {
    public int[][] merge(int[][] a) {
        int n = a.length;
        Arrays.sort(a, (x,y)->x[0]-y[0]);
        List<int[]> list = new ArrayList();
        int[] current = a[0];
        list.add(current);
        for(int[] interval:a){
            int currb = current[0];
            int curre = current[1];
            int nextb = interval[0];
            int nexte = interval[1];
            
            if(nextb<=curre){
                current[1] = Math.max(curre,nexte);
            }
            else{
                current = interval;
                list.add(current);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}