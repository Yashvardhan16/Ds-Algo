class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        Set<Character> set = new HashSet();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        char[] c = s.toCharArray();
        int start=0,end=n-1;
        while(start<end){
            while(start<end && !set.contains(c[start])){
                start++;
            }
             while(start<end && !set.contains(c[end])){
                end--;
            }
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;end--;
            
        }
        return new String(c);
    }
}