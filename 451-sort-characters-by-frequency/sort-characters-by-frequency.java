class Solution {
    public String frequencySort(String s) {
        int [] freq = new int[128];
        int i = 0;
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            int idx = 0;
            int max = -1;
            for(int j = 0; j< 128; j++){
                if(freq[j]>max){
                    max = freq[j];
                    idx = j;
                }
            }
            while(max-->0){
                sb.append((char)idx+"");
                i++;
            }
            freq[idx] = 0;
        }
        return sb.toString();
    }
}