class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>(Arrays.asList(helper(p1,p2),helper(p1,p3),helper(p1,p4),helper(p2,p3),helper(p2,p4),helper(p3,p4)));
        return !set.contains(0) && set.size()==2;
    }
    int helper(int[] a,int [] b){
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}