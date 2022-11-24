class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        
        String[] s= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        
        for(String i:s){
            sb.append(i);
        }
        if(sb.charAt(0)=='0') return "0";
        return sb.toString();
    }
}