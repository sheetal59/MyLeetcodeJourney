class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        return fibb(n,dp);
    }
    public int fibb(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = fibb(n-1,dp) + fibb(n-2,dp);
        return dp[n];
    }
}