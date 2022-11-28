class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] win = new int[1000001];
        int[] loss= new int[1000001];
        List<List<Integer>> list = new ArrayList();
        for(int [] i:matches){
            win[i[0]]++;
            loss[i[1]]++;
        }
       List<Integer> wins = new ArrayList();
        List<Integer> losses = new ArrayList();
        
        for(int i=0;i<1000001;i++){
            if(win[i]>0 && loss[i]==0){
                wins.add(i);
            }else if(loss[i]==1){
                losses.add(i);
            }
        }
        list.add(wins);list.add(losses);
        return list;
    }
}