class Solution {
    public int[][] insert(int[][] intervals, int[] a) {
   
        int n = intervals.length;
        List<int[]> list = new ArrayList();
        for(int i[]:intervals){
          if(a[1]<i[0]){
           list.add(a);
              a=i;
          }else if(a[0]>i[1]){
             list.add(i);
          } else{
              a[0] = Math.min(a[0],i[0]);
              a[1] = Math.max(a[1],i[1]);
          } 
        }
        list.add(a);
        return list.toArray(new int[list.size()][2]);
    }
}