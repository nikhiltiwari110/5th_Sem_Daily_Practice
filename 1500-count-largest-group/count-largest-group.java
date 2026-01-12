class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int c = 0;
        for(int i = 1; i <= n; i++){
            int x = sum(i);
            if(!map.containsKey(x)){
            map.put(x,1);
            }else{
                map.put(x,map.get(x)+1);
            }
        }
        int max = 1;
        for(int v : map.keySet()){
            int f = map.get(v);
            max = Math.max(f,max);
        }
        for(int v:map.keySet()){
            int f = map.get(v);
            if(f == max){
                c++;
            }
        }
        return c;
    }
    public int sum(int m){
        int sum1 = 0;
        while(m>0){
            int r = m%10;
            sum1 = sum1 + r;
            m = m/10;
        }
        return sum1;
    }
}