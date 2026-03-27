class Solution {
    public int smallestRepunitDivByK(int k){
        HashSet<Integer> set = new HashSet<>();
        int n = 11;
        if(k==1) return 1;
        int c = 2;
        while(n%k!=0){
            int rem = n % k;
            if(set.contains(rem)){
                return -1;
            }
            set.add(rem);
            n = rem*10 + 1;
            c++;
        }
        return c;
    }
}