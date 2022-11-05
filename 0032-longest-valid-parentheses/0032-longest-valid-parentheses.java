class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> st = new Stack();
        Stack<Integer> index = new Stack();
        int max =0;
        index.add(-1);
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.add(c);
                index.add(i);
            }else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                    index.pop();
                    max = Math.max(max,i-index.peek());
                }else{
                    index.add(i);
                }
            }
        }
        return max;
    }
}