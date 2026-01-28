class Solution {
    public int findTheWinner(int n, int k) {
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        int c = 1;
        while(q.size()!=1){
            if(c != k){
                int x = q.poll();
                q.add(x);
                c++;
            }
            else{
                q.poll();
                c = 1;
            }
        }
        return q.poll();
    }
}