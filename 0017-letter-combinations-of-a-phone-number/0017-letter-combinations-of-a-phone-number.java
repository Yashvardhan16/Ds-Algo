class Solution {
    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
      
        List<String> list = new ArrayList();
          if(digits.equals("")) return list;
        helper(list,new StringBuilder(),digits,0);
        return list;
    }
    void helper(List<String>list,StringBuilder sb,String s,int start){
        if(start==s.length()){
            list.add(sb.toString());
            return;
        }
        
        int  c= s.charAt(start) -'0';
        String curr = map[c];
        
        for(int i=0;i<curr.length();i++){
            sb.append(curr.charAt(i));
            helper(list,sb,s,start+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}