class Solution {
    public int distMoney(int money, int children) {
        int r = money - children;//23 - 2 = 21
        if(r<0){
            return -1;
        }else if(r<7){
            return 0;
        }
        int p = r/7; // 3
        int rr = r%7; // 0
        if(p<children){
            if(rr == 3 && children - p == 1){
                return Math.max(p - 1,0);
            }
            else{
                return p;
            }
        }else if (p>children){
            return children-1;
        }else{ // p == children
            if(rr == 0){
                return p;
            }else{
                return p -1;
            }
        }
    }
}