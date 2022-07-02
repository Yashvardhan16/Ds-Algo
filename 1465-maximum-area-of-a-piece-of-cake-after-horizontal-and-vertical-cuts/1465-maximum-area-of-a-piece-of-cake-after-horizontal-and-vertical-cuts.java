class Solution {
    public int maxArea(int h, int w, int[] ho, int[] ve) {
        Arrays.sort(ho);
        Arrays.sort(ve);
        int mod = 1000000007;
        int maxh = Math.max(ho[0],h-ho[ho.length-1]);
        int maxv = Math.max(ve[0],w-ve[ve.length-1]);
        
        for(int i=1;i<ho.length;i++){
            maxh = Math.max(maxh,ho[i]-ho[i-1]);
        }
        for(int i=1;i<ve.length;i++){
            maxv = Math.max(maxv,ve[i]-ve[i-1]);
        }
        return (int)((long)maxh*maxv%mod);
    }
}