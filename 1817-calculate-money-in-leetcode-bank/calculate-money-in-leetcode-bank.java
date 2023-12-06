class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int monday =1;
        while(n>0){
            for(int i=0; i<Math.min(n,7); i++){
                sum += monday+i;
             }
             n = n-7;
             monday++;
        }
        return sum;
    }
}