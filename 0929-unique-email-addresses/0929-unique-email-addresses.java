class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String > set = new HashSet();
        
        for(int i=0;i<emails.length;i++){
            String curr = emails[i];
            String[] nums = curr.split("@");
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<nums[0].length();j++){
                if(nums[0].charAt(j)=='+') break;
                else if(nums[0].charAt(j)!='.'){
                    sb.append(nums[0].charAt(j));
                }
            }
            sb.append('@');
            sb.append(nums[1]);
            set.add(sb.toString());
        }
        return set.size();
    }
}