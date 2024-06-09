class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        for(int i=0; i<n; i++){
            if(nums[i]!=min && nums[i]!=max){
                return nums[i];
            }
        }
        return -1;
    }
}