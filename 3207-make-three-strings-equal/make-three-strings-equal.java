class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int s = 0;
        int e = 0;
        if(s1.charAt(0)!=s2.charAt(0)||s2.charAt(0)!=s3.charAt(0)){
            return -1;
        }
        
        for(int i = 0; i < s1.length() && i < s2.length() ; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            s = i + 1;
        }
        
        for(int j = 0; j < s && j < s3.length(); j++){
            if(s2.charAt(j) != s3.charAt(j)){
                break;
            }
            e = j+1;
        }
        int v1 = s1.length() - e;
        int v2 = s2.length() - e;
        int v3 = s3.length() - e;
        return v1 + v2 + v3;
    }
}