class Solution {
    public void rotate(int[] nums, int k) {
        k = k% nums.length;
        if(k<0){
            k+=nums.length;
        }
        reverse(nums,0, nums.length-k-1);
        reverse(nums,nums.length-k, nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int nums[], int i, int j){
        int start =i;
        int end =j;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}