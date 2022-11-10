class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] curr = intervals[0];
        list.add(curr);
        for(int[] i :intervals){
            int currb = curr[0];
            int curre = curr[1];
            int nextb = i[0];
            int nexte = i[1];
            
            if(curre<nextb){
               list.add(i);
                curr = i;
                
            }else{
                
                 curr[0] = Math.min(currb,nextb);
                curr[1] = Math.max(curre,nexte);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}