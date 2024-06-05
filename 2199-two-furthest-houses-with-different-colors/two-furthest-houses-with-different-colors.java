class Solution {
    public int maxDistance(int[] colors) {
        int maxVal = 0;
        for(int i=0; i<colors.length; i++){
            for(int j= colors.length-1; j>i; j--){
                if(colors[i]!=colors[j]){
                    maxVal = Math.max(maxVal, (j-i));
                    break;
                }
            }
        }
        return maxVal;
    }
}