class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList();
        int[] current = intervals[0];
        list.add(current);
        for(int[] i :intervals){
            int currentbegin = current[0];
            int currentend = current[1];
            int nextbegin = i[0];
            int nextend = i[1];
            
            if(currentend>=nextbegin){
                current[1] = Math.max(currentend,nextend);
            }
            else{
                current = i;
                list.add(current);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}