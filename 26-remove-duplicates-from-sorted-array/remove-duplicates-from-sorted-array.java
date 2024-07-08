class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(set.contains(nums[j])){
                continue;
            }
            else{
                set.add(nums[j]);
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}