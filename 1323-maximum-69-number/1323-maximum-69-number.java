class Solution {
    public int maximum69Number (int num) {
        String s= Integer.toString(num);
        int[] nums = new int[s.length()];
        for(int i=0;i<s.length();i++){
            nums[i] = Integer.valueOf(s.charAt(i)-'0');
        }
        int k =1;
       
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
           if(nums[i]==6 && k>0){
                sb.append(9);
                k--;
            }else{
                sb.append(nums[i]);
            }
        }
       
        return Integer.valueOf(sb.toString());
    }
}