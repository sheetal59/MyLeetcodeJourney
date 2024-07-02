class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int rangeSum=0;
        int numSum =0;
        for(int i=0; i<=range;i++){
            rangeSum += i;
        }
        for(int i=0 ; i<nums.length; i++){
            numSum += nums[i];
        }
        int missingNum = rangeSum - numSum;
        return missingNum;
    }
}