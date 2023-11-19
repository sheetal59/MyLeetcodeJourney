class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int operations=0;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i] != nums[i-1]){
                operations += (nums.length-i);
            }
        }
        return operations;

    }
}