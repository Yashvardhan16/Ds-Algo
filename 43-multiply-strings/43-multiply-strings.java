class Solution {
    public String multiply(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m==0||n==0||s.equals("0")||t.equals("0")) return "0";
        
        if(s.equals("1")) return t;
        if(t.equals("1")) return s;
        int[] ans = new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int mul = (s.charAt(i)-'0') * (t.charAt(j)-'0');
                int sum = mul + ans[i+j+1];
                ans[i+j+1] = sum%10;
                ans[i+j] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i: ans){
            if(i==0 && sb.length()==0) continue;
            sb.append(i);
        }
        return sb.toString();
    }
}