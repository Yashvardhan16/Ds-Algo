class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
           ans[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(ans, (a,b)-> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String i:ans){
            sb.append(i);
        }
        if(sb.charAt(0)=='0') return "0";
        return sb.toString();
    }
}