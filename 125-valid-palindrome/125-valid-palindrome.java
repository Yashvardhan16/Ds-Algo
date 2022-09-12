class Solution {
    public boolean isPalindrome(String temp) {
        if(temp==""||temp==" ") return true;
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack();
        String s= temp.toLowerCase();
        for(int i=0;i<s.length();i++){
       char ch = (char)s.charAt(i);
     if(ch>='0' && ch<='9'||ch>='a' && ch<='z'){
                sb.append(s.charAt(i));
                st.push(s.charAt(i));
     }
        }
        for(int i=0;i<sb.length()/2;i++){
            if(st.pop()!=sb.charAt(i)){
                return false;
            }
        }
       
        return true;
    }
}