class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for(int i = 0; i < nums.length; i++){
            long str = 0;
            for(int j = i + 1; j < nums.length; j++){
                long mul = (long)nums[i]*(long)nums[j];
                long gcd = (long)(gcd(nums[i],nums[j]));
                str = mul/(gcd*gcd);
                max = Math.max(max,str);
            }
        }
        return max;
    }
    public int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}