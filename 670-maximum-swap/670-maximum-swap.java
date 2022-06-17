class Solution {
    public int maximumSwap(int n) {
     char[] c = Integer.toString(n).toCharArray();

        int[] count = new int[10];
        for(int i=0;i<c.length;i++){
            count[c[i]-'0'] = i;
        }

        for(int i=0;i<c.length;i++){
            for(int j=9;j>c[i]-'0';j--){
                if(count[j]>i){
                    swap(c,count[j],i);
                    return Integer.valueOf(new String(c));
                }
            }
        }
       return n; 
    }
    void swap(char[] c,int i,int j){
         char temp = c[i];
         c[i] = c[j];
         c[j] = temp;
    }
}