class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> cl = new ArrayList<>();
        //generate all subsets and store them
        subset(nums,0,ll,cl);
        //take sum of xor of each subset
        int result = 0;
        for(List<Integer> s : ll){
            int sum = 0;
            for(int el : s){
                sum = sum ^ el;
            }
            result += sum;
        }
        return result;

    }
    public void subset(int [] nums, int i, List<List<Integer>> ll,List<Integer> cl){
        if(i == nums.length){
            ll.add(new ArrayList<>(cl));
            return;
        }

        //pick
        cl.add(nums[i]);
        subset(nums,i+1,ll,cl);
        //notpick
        cl.remove(cl.size()-1);
        subset(nums,i+1,ll,cl);
    }
}