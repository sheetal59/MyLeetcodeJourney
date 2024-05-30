class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
       int ans[] = new int[n+1];
       ans[0] =0;

       for(int i=0; i<gain.length; i++){
        ans[i+1] = ans[i] + gain[i];
       }
       Arrays.sort(ans);
       return ans[n];

    }
}