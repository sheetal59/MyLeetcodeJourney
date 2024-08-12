class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx =-1;
        
        //checking for the brakpoint--peeche se chota prefix kon h
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        //base case if the element is the last permut we are going to reverse
        if(idx==-1){
            reverse(nums,0);
        }else {
        //after finding the breakpoint we have to swap the indices and then sort the remaining
        for(int i=n-1; i>=0; i--){
            if(nums[i]>nums[idx]){
                int temp = nums[i];
                nums[i]= nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        reverse(nums, idx+1);
        }
    }
    public void reverse(int[]nums, int start){
         int i = start;
         int j = nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}