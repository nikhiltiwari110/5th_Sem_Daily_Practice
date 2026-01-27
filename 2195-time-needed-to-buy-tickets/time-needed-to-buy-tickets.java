class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i < tickets.length; i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            int idx = q.poll();
            int el = tickets[idx];
            if(el>0){
                tickets[idx]--;
                q.add(idx);
                time++;
            }
            if(tickets[k]==0){
                return time;
            }
        }
        return -1;
    }
}