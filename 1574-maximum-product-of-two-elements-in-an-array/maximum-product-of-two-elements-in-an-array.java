class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int j=nums.length-2;
        int maxProd = (nums[i]-1) * (nums[j]-1);
        return maxProd;
    }
}