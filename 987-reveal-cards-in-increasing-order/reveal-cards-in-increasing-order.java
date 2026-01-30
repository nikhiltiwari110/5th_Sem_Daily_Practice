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
            int in_ans = q.poll();
            ans[in_ans] = deck[idx++];
            int r = q.poll();
            q.add(r);
        }
        while(!q.isEmpty()){
            ans[q.poll()] = deck[idx];
        }
        return ans;
    }
}