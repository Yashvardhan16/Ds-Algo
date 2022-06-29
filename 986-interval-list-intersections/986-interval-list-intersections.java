class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int ptr1=0;
        int ptr2=0;
        List<int[]> list = new ArrayList();
        while(ptr1<a.length && ptr2<b.length){
            int csp = Math.max(a[ptr1][0],b[ptr2][0]);
            int cep = Math.min(a[ptr1][1],b[ptr2][1]);
            
            if(csp<=cep){
                int[] interval = new int[]{csp,cep};
                list.add(interval);
            }
            if(a[ptr1][1]<b[ptr2][1])
                ptr1++;
            else
                ptr2++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}