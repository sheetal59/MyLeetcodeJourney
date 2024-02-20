class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        //Initialize the sum of all elements of array with 0
        int numsSum = 0;
        //Initialize the sum of all the numbers from 0 to nums.length
        int rangeSum = 0;
        //iterate through the numbers of range and update the value of rangeSum
        for(int i=0; i<=range; i++){
            rangeSum += i;
        }
        //iterate through each element in array and get their sum
        for(int num:nums){
            numsSum += num;
        }
        //missing no. =  RangeSum - numsSum;
        int missingNo = rangeSum - numsSum;
        return missingNo;
        
    }
}