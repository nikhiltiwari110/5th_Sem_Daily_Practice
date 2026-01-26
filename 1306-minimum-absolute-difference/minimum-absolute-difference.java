class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            min = Math.min(min,(arr[i+1]-arr[i])); 
        }
        for(int i = 0; i < arr.length - 1; i++){
            int d = arr[i+1] - arr[i];
            if(d==min){
                List<Integer> ll = new ArrayList<>();
                ll.add(arr[i]);
                ll.add(arr[i+1]);
                res.add(ll);
            }
        }
        return res;
    }
}