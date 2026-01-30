class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int [] ans = new int[deck.length];
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < deck.length; i++){
            q.add(i);
        }
        int idx = 0;
        while(q.size()>1){
            ans[q.poll()] = deck[idx++];
            q.add(q.poll());
        }
        ans[q.poll()] = deck[idx];
        return ans;
    }
}