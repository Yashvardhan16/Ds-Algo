class Solution {
    String[] map = new String[]{" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
   
        if(digits.length()==0) return list;
        helper(0,list,digits,new StringBuilder());
        return list;
    }
    void helper(int length, List<String> list,String digits,StringBuilder temp){
        if(length==digits.length()){
            list.add(temp.toString());
            return;
        }
        char ch = digits.charAt(length);
        String s = map[ch-'0'];
        for(char c:s.toCharArray()){
            temp.append(c);
            helper(length+1,list,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}