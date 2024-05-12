class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(k+nums[i])){
                count += map.get(k+nums[i]);
            }
        }
        return count;
    }
}