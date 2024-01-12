class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        return fibn(n,dp);
    }
    public int fibn(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        dp[n] = fibn(n-1,dp) + fibn(n-2,dp);
        return dp[n];
    }
}