class Solution {
    public int getSum(int a, int b) {
        int carry = (a & b) <<1;
        int result = a^b;
        if(carry==0){
            return result;
        }
        return getSum(carry,result);
    }
}