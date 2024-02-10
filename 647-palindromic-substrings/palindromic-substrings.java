class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean dp[][]= new boolean[n][n];
        int ans =0;
        //initialization
        for(int i=0; i<n; i++){
            dp[i][i]= true;
            ans++;
        }
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]= true;
                ans++;
            }
        }
        for(int l=3; l<=n; l++){
            for(int i=0; i<n-l+1; i++){
                if(s.charAt(i)==s.charAt(i+l-1) && dp[i+1][i+l-2]){
                    dp[i][i+l-1] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}