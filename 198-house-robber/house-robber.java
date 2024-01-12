class Solution {
    int[]dp;
    public int rob(int[] nums) {
         dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return dpp(nums, nums.length-1);
    }
    public int dpp(int[] nums, int i){
        if(i<0){
            return 0;
        }
        if(dp[i]>=0){
            return dp[i];
        }
        dp[i] = Math.max(dpp(nums,i-2)+nums[i], dpp(nums,i-1));
        return dp[i];
    }
}