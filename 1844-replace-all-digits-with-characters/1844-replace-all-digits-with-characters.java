class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<s.length();i=i+2){
            char c = (char)(s.charAt(i-1)+s.charAt(i)-'0');
            sb.append(s.charAt(i-1));
            sb.append(c);
            
        }
        if(s.length()-sb.length()==1)sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}