class Solution {
    String[] map = new String[]{""," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList();
        if(digits.length()==0) return list;
        backtrack(list,digits,new StringBuilder(),0);
        return list;
    }
    void backtrack(List<String> list ,String digits,StringBuilder sb,int length){
        if(length==digits.length()){
            list.add(sb.toString());
            return;
        }
        
        char ch = digits.charAt(length);
        String s = map[ch-'0'];
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            backtrack(list,digits,sb,length+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}