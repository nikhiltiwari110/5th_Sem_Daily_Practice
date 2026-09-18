class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1 = Integer.MIN_VALUE;
        int cand2 = Integer.MIN_VALUE;
        int c1 = 0;
        int c2 = 0;
        List<Integer> ll = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            if(nums[i]==cand1){
                c1++;
            }else if(nums[i]==cand2){
                c2++;
            }else if(c1==0){
                cand1 = nums[i];
                c1 = 1;
            }else if(c2==0){
                cand2 = nums[i];
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==cand1){
                c1++;
            }else if(nums[i]==cand2){
                c2++;
            }
        }
        if(c1>nums.length/3){
            ll.add(cand1);
        }
        if(c2>nums.length/3){
            ll.add(cand2);
        }
        return ll;

    }
}