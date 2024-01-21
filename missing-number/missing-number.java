class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int rangeSum=0;
        int range=nums.length;
        for(int i=0; i<=nums.length;i++){
            rangeSum+=i;
        }
        for(int num : nums){
            sum+= num;
        }
        int missingNo = rangeSum-sum; 
        return missingNo;
    
    }
}