class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return mcm(values,1,n-1,dp);
    }
    public int mcm(int values[], int i, int j, int dp[][]){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans =  Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mcm(values,i,k,dp);
            int cost2 =  mcm(values,k+1,j,dp);
            int cost3 = values[i-1]*values[k]*values[j];
            int finalCost =  cost1 + cost2 + cost3;
            ans =  Math.min(ans,finalCost);
        }
        return dp[i][j]= ans;
    }
}