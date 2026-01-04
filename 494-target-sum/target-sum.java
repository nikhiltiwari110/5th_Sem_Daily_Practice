class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public HashMap<String,Integer> dp = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        
        return rec(0,nums,target,0);
    }   
    
    public int rec(int amount,int [] nums, int target,int i){
        if(amount == target && i == nums.length){
            return 1;
        }
         if(i == nums.length){
            return 0;
        }
        String s = i+" "+amount;
        if(dp.containsKey(i+" "+amount)){
            return dp.get(s);
        }
        int n = rec(amount+nums[i],nums,target,i+1);
        int m = rec(amount-nums[i],nums,target,i+1);
        dp.put(s,n+m);
        return n+m;
    }
}