class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack();
        String[] nums = s.split(" ");
        for(int i=0;i<nums.length;i++){
            if(!nums[i].isEmpty()){
            st.add(nums[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}