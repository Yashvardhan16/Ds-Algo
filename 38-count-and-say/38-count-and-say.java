class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=0;i<n-1;i++){
            char c = s.charAt(0);
            int count =1;
            StringBuilder sb = new StringBuilder();
            
            for(int j=1;j<s.length();j++){
                if(c!=s.charAt(j)){
                    sb.append(count);
                    sb.append(c);
                    count =0;
                    c = s.charAt(j);
                }
                count++;
            }
            sb.append(count);
            sb.append(c);
            s = sb.toString();
        }
        return s;
    }
}