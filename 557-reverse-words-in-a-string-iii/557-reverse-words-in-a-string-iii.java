class Solution {
    public String reverseWords(String s) {
        StringBuilder var = new StringBuilder(s);
        String[] nums = var.reverse().toString().split(" ");
        int n = nums.length;
       
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(nums[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}