class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet(Arrays.asList(words));
        List<String> wordlist = new ArrayList<>(set);
        
        Set<String> dup = new HashSet();
        
        for(int i=0;i<wordlist.size();i++){
            for(int j=0;j<wordlist.size();j++){
                if(i!=j){
                    if(wordlist.get(i).endsWith(wordlist.get(j))){
                        dup.add(wordlist.get(j));
                    }
                }
            }
        }
       
        int count =0;
        for(String word:wordlist){
            if(!dup.contains(word)){
                count += word.length()+1;

            }
        }
        return count;
    }
}