class Solution {
    public String multiply(String a, String b) {
        int n = a.length();
        int m = b.length();
        if(n==0||m==0||a.equals("0")||b.equals("0")) return "0";
        
        int[] ans = new int[n+m];
       for(int i=n-1;i>=0;i--){
           for(int j=m-1;j>=0;j--){
               int mul = (a.charAt(i)-'0')*(b.charAt(j)-'0');
               int sum = mul+ ans[i+j+1];
               ans[i+j+1] = sum%10;
               ans[i+j]+=sum/10;
           }
       }

        String res="";
        for(int i:ans){
            if(i==0&&res.length()==0) continue;
            res+=i;
        }
        return res;
    }
}