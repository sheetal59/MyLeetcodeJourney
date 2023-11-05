class Solution {
    public int getWinner(int[] arr, int k) {
        int current_Winner = arr[0];
        int win_count = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]> current_Winner){
                current_Winner = arr[i];
                win_count = 0;
            }
            if(++win_count == k){
                break;
            }
        }
         
        return current_Winner;
    }
}