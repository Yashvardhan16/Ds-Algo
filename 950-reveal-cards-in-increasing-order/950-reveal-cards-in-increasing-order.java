class Solution {
    public int[] deckRevealedIncreasing(int[] cards) {
         int n = cards.length;
        Arrays.sort(cards);
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            dq.add(i);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[dq.poll()] = cards[i];
            dq.add(dq.poll());
        }
        return ans;
    }
}