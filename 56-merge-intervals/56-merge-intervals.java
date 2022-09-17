class Solution {
    public int[][] merge(int[][] intervals) {
    
        List<int[]> list = new ArrayList();
            if(intervals.length==0||intervals[0].length==0)   return list.toArray(new int[list.size()][2]);
        Arrays.sort(intervals,(a,b) ->(a[0]-b[0]));
        int[] current = intervals[0];
        list.add(current);
        
        for(int[] i:intervals){
            int currb = current[0];
            int curre = current[1];
            int nextb = i[0];
            int nexte = i[1];
            
            if(curre<nextb){
                
                current =i;
                 list.add(current);
               
            }else{
                current[0] = Math.min(currb,nextb);
                current[1] = Math.max(curre,nexte);
            }
            
        }
        return list.toArray(new int[list.size()][2]);
    }
}