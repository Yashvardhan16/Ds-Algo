class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
          int i=0;
        int j=0;
        int k=0;
        int[] ans = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans[k] = a[i];
                i++;
                k++;
            }else {
                 ans[k] = b[j];
                j++;
                k++;
            }
            
        }
         while(i<a.length){
               ans[k] = a[i];
                i++;
                k++;
         } 
        while(j<b.length){
                ans[k] = b[j];
                j++;
                k++;
         }
        double median =0;
        if(ans.length%2==1){
            median = ans[ans.length/2];
        }else{
            median = (ans[ans.length/2] + ans[ans.length/2-1])/2.0;
        }
        return median;
    }
}
    