class Solution {
    public int countHillValley(int[] nums) {
        int hill =0;
        int left = nums[0];
        //left and right must be smaller than nums[i] and
        // nums[i]!= nums of left and right
        for(int i=1; i<nums.length-1; i++){
            if((nums[i] > nums[i+1] && nums[i]>left) || (nums[i+1]>nums[i] && nums[i]<left)){
                hill++;
                if(nums[i] != nums[i+1]){
                    left = nums[i];
                }
            }
        }
        return hill;
    }
}