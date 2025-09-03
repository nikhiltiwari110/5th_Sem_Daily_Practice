class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int el : friends){
            set.add(el);
        }
        int [] arr = new int[friends.length];
        int j = 0;
        for(int i = 0; i < order.length; i++ ){
            if(set.contains(order[i])){
                arr[j++] = order[i];
            }
        }
        return arr;

    }
}