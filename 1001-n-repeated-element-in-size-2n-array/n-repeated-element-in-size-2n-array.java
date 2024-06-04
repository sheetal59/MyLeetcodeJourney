class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==n){
                return key;
            }
        }
        return -1;
    }
}