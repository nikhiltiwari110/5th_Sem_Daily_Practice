class Solution {
    public int countNicePairs(int[] nums) {
        long c = 0;
        long rev [] = new long [nums.length];
        HashMap<Long,Long> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            rev[i] = nums[i] - rever(nums[i]); 
        }
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(rev[i])){
                map.put(rev[i],1L);
            }else{
                map.put(rev[i],map.get(rev[i])+1);
            }
        }
        for(long v:map.keySet()){
            long f = map.get(v);
            if(f==2){
                c++;
            }else if(f>2){
                c += f*(f-1)/2;
            }
        }
        return (int)(c%(long)(Math.pow(10,9)+7));
    }
    public int rever(int x){
        int re = 0;
        while(x>0){
            int r = x % 10;
            re = re*10 + r;
            x = x / 10;
        }
        return re;
    }
}