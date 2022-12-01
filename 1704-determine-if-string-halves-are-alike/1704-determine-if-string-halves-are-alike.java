class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()%2==1) return false;
        
        String first = s.substring(0,s.length()/2);
        String  sec = s.substring(s.length()/2,s.length());
        List<Character> list = new ArrayList();
        list.add('a');list.add('O');list.add('U');
        list.add('e');list.add('E');list.add('I');
        list.add('i');list.add('o');list.add('u');list.add('A');
        int firstcount = 0;
        for(int i=0;i<first.length();i++){
            if(list.contains(first.charAt(i))){
                firstcount++;
            }
        }
         int seccount = 0;
        for(int i=0;i<sec.length();i++){
            if(list.contains(sec.charAt(i))){
                seccount++;
            }
        }
        return firstcount==seccount;
    }
}