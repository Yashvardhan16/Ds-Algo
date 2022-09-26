class Solution {
    public int minSwap(int[] a, int[] b) {
        int n = a.length;
        if(a.length==0||b.length==0) return 0;
        int[] no = new int[n];
        int[] yes = new int[n];
        yes[0] = a[0]==b[0]?0:1;
        for(int i=1;i<n;i++){
            no[i] =n;
            yes[i] = n;

            if(a[i]>a[i-1] && b[i]>b[i-1]){
                no[i] = no[i-1];
                yes[i] = yes[i-1]+1;
            } if(a[i]>b[i-1] && b[i]>a[i-1]){
                no[i] = Math.min(no[i],yes[i-1]);
                yes[i] = Math.min(yes[i],no[i-1]+1);
            }

        }
        return Math.min(yes[n-1],no[n-1]);
    }
}
    