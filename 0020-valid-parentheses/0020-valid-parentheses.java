class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(valid(c)){
                st.push(c);
            }else if(st.isEmpty()) return false;
            else if(st.peek()=='(' && c==')') st.pop();
            else if(st.peek()=='[' && c==']') st.pop();
            else if(st.peek()=='{' && c=='}') st.pop();
            else return false;
        }
        return st.isEmpty();
    }
    boolean valid(char c){
        if(c=='('||c=='['||c=='{') return true;
        else return false;
    }
}