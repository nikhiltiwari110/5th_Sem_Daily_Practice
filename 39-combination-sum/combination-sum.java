class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combination(candidates,target,ans ,ll, 0);
        return ans;
    }
    public static void Combination(int [] coin, int amount,List<List<Integer>> ans, List<Integer> ll, int idx){
        if (amount == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]){
                ll.add(coin[i]);
                Combination(coin, amount - coin[i],ans,ll,i);
                ll.remove(ll.size() - 1);
            }
        }
    }
}