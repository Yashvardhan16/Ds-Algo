class Solution {
    public String multiply(String a, String b) {
        int n = a.length()-1;
        int m = b.length()-1;
        int[] ans = new int[n+m+2];
        if(a.equals("0")||b.equals("0")) return "0";
        for(int i=n;i>=0;i--){
            for(int j=m;j>=0;j--){
                int mul = (a.charAt(i)-'0')*(b.charAt(j)-'0');
                int sum = mul + ans[i+j+1];
                
                ans[i+j+1] = sum%10;
                ans[i+j] += sum/10;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for(int i:ans){
            if(i==0 && sb.length()==0) continue;
            sb.append(i);
      
        }
        return sb.toString();
    }
}