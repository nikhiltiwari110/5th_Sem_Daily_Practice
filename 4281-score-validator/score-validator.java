class Solution {
    public int[] scoreValidator(String[] events) {
     int score = 0;
     int counter = 0;
     for(int i = 0; i < events.length && counter < 10; i++){
        String s = events[i];
        if(s.equals("W")){
            counter++;
        }else if(s.equals("WD")||s.equals("NB")){
            score++;
        }
        else{
            int n = s.charAt(0)-'0';
            score+=n;
        }
     }
     int [] ans = new int[2];
     ans[0] = score;
     ans[1] = counter;
     return ans;   
    }
}