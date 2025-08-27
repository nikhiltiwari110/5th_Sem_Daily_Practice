class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int c = 0;
                int key = arr[i];
                while (set.contains(key)) {
                    set.remove(key);
                    c++;
                    key++;
                }
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
}