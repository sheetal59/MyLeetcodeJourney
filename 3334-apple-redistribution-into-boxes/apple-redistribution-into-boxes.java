class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        int n = capacity.length;
        for(int i=0; i<apple.length; i++){
            sum = sum + apple[i];
        }
        int count =0;
        for(int i=n-1; i>=0; i--){
            if(sum>capacity[i]){
                sum = sum-capacity[i];
                count++;
            }
            else if (sum<=capacity[i]){
                sum=0;
                count++;
                break;
            }
        }
        return count;
    }
}