class Solution {
    public int maxWidthOfVerticalArea(int[][] arr) {
        
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));

        int ans = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=1; i<n; i++){
            ans = Math.max(ans,arr[i][0]-arr[i-1][0]);
        }
        return ans;
    }
}