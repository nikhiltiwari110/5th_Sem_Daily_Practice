class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int copy = n;
        while(copy>0){
            copy = copy / 10;
            count++;
        }
        int sum = 0;
        if(count % 2 == 0){
            for(int i = 1;i<=count;i++){
                int rem = n % 10;
                if(i%2!=0){
                    sum = sum - rem;
                }else{
                    sum = sum + rem;
                }
                n = n / 10;
            }
        }else{
            for(int i = 1; i <= count; i++){
                int rm = n % 10;
                if(i%2!=0){
                    sum = sum + rm;
                }else{
                    sum = sum - rm;
                }
                n = n/10;
            }
        }
        return sum;    
    }
}