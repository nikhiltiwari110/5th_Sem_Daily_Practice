class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ll = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int n = i;
            while (n <= high&&n%10<9) {
                int rem = n % 10;
                int d = rem + 1;
                n = n * 10 + d;
                if (n >= low && n <= high) {
                    ll.add(n);
                }
            }
        }
        Collections.sort(ll);
        return ll;
    }
}