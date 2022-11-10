class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            
            if(!st.isEmpty() && c ==st.peek()){
                st.pop();
            }else{
                st.push(c);
            }
        }
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}