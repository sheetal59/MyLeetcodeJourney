class Solution {
    public void sortColors(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        for(int i=1; i<=largest; i++){
            count[i] +=count[i-1];
        }
        int output[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            output[--count[nums[i]]] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = output[i];
        }
       
    }
}