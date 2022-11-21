class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack();
        int len = s.length();
        int ans =0;
        int curr =0;
        int sign =1;
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                curr = s.charAt(i)-'0';
                while(i+1<len && Character.isDigit(s.charAt(i+1))){
                    curr = curr*10 +s.charAt(i+1)-'0';
                    i++;
                }
                curr=curr*sign;
                ans +=curr;
                curr =0;
                sign =1;
            }else if(s.charAt(i)=='+'){
                sign =1;
            }else if(s.charAt(i)=='-'){
                sign =-1;
            }else if(s.charAt(i)=='('){
                st.push(ans);
                st.push(sign);
                ans =0;
                sign =1;
            }else if(s.charAt(i)==')'){
                int prevsign = st.pop();
                ans = ans*prevsign;
                int prevans = st.pop();
                ans = ans+prevans;
            }
        }
        return ans;
    }
}