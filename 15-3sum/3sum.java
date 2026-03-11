class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            //current element
            int el = nums[i];
            //search for sum (0 - el)
            int si = i + 1;
            int ei = nums.length - 1;
            int target = 0 - el;
            while (si < ei) {
                if (nums[si] + nums[ei] == target) {
                    res.add(new ArrayList<>(Arrays.asList(el, nums[si], nums[ei])));
                    si++;
                    ei--;
                } else if (nums[si] + nums[ei] > target) {
                    ei--;
                } else {
                    si++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}