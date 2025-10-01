class Solution {
    public boolean lemonadeChange(int[] bills) {
        int in_five = 0;
        int in_ten = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i]==5){
                in_five++;
            }else if(bills[i]==10){
                if(in_five==0){
                    return false;
                }
                in_ten++;
                in_five--;
            }else{
                if((in_ten==0&&in_five<3)||(in_ten!=0&&in_five<1)){
                    return false;
                }
                else if(in_ten!=0){
                    in_ten--;
                    in_five--;
                }else{
                    in_five-=3;
                }
            }
        }
        return true;
    }
}