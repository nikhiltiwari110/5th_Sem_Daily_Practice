class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            String [] arr = str.split("");
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder("");
            for(String ch : arr){
                sb.append(ch);
            }
            String sbc = sb.toString();
            if(!map.containsKey(sbc)){
                List<String> ll = new ArrayList<>();
                ll.add(str);
                map.put(sbc,ll);
            }else{
                map.get(sbc).add(str);
            }
        }
        for(String s : map.keySet()){
            List<String> rs = new ArrayList<>();
            for(String se : map.get(s)){
                rs.add(se);
            }
            res.add(rs);
        }
        // System.out.println(map);
        return res;
    }
}