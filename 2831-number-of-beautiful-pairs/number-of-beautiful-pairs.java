class Solution {
    public int countBeautifulPairs(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
                int fd = first(nums[i]);
                int ld = nums[j]%10;
                if(gcd(fd,ld) == 1){
                    c++;
                }
            }
        }
        return c;
    }
    public int gcd(int x, int y){
        while(x!=y){
            if(x>y){
                x = x - y;
            }else{
                y = y - x;
            }
        }
        return x;
    }
    public int first(int n){
        while(n>9){
            n = n / 10;
        }
        return n;
    }
}