class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time =0;
        for(int i=0; i<colors.length()-1;i++){
            char a = colors.charAt(i);
            char b = colors.charAt(i+1);
            if(a==b){
                time += Math.min(neededTime[i], neededTime[i+1]);
                if(neededTime[i]> neededTime[i+1]){
                    neededTime[i+1] = neededTime[i];
                }
                else{
                    neededTime[i] = neededTime[i+1];
                }
            }
        }
        return time;
    }
}