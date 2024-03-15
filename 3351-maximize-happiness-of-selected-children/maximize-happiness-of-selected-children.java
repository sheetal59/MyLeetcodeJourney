class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        int j = n-1;
        if(k<=0){
            return 0;
        }
        Arrays.sort(happiness);
        int count =0;
        long sum = 0;
        while(j>=0 && k>0){
            if(happiness[j]-count <=0 ){
                break;
            }
            sum += (happiness[j]-count);
            count++;
            j--;
            k--;
        }
        return sum;
    }
}