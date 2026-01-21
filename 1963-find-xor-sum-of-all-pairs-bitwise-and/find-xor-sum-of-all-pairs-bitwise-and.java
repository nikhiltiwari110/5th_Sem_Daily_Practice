class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        //[a,b,c] [x,y]
        // [a&x, a&y, b&x, b&y, c&x, c&y]
        // (a&x)^(a&y)^(b&x)^(b&y)^(c&x)^(c&y)
        // a&(x^y)^b&(x^y)^c&(x^y)
        // (x^y) & (a^b^c)

        int xor1 = 0;
        for(int x : arr1){
            xor1 ^= x;
        }
        int xor2 = 0;
        for(int x : arr2){
            xor2 ^= x;
        }
        return xor1&xor2;
    }
}