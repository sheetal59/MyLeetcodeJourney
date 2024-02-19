class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start=0;
        int end = n-1;
        while(start<end){
            int mid = start + (end-start)/2;
        
        if( mid>0 && nums[mid-1]>nums[mid]){
            return nums[mid];
        }
        if(nums[start]<= nums[mid] && nums[mid]>nums[end]){
            start = mid+1;
        }else
        end = mid-1;
        }
        
        return nums[start];
    }
    
}