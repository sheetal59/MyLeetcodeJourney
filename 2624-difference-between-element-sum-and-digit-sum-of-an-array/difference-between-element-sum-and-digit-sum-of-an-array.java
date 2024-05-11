class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum =0;
        for(int i=0; i<nums.length; i++){
            elementSum += nums[i];
        }
        for(int num: nums){
            String str = String.valueOf(num);
            for(int i=0; i<str.length(); i++){
                digitSum += Character.getNumericValue(str.charAt(i));
            }
        }
        int difference = elementSum - digitSum;
        return difference;
    }
}