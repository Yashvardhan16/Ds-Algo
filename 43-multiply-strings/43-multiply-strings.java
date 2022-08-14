class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        if(n==0||m==0||num1.equals("0")||num2.equals("0")) return "0";
        int[] ans = new int[n+m];
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
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