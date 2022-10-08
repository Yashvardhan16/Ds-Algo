class Solution {
    String[] nums = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> list = new ArrayList();
        if(digits.equals(""))return list;
        helper(digits,list,new StringBuilder(),0);
        return list;
    }
    void helper(String digits,List<String> list,StringBuilder sb,int length){
        if(length==digits.length()){
            list.add(sb.toString());
            return;
        }
        char c = digits.charAt(length);
        String s= nums[c-'0'];
        
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            helper(digits,list,sb,length+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}