class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int ans = 0;
        for(int i =0; i<=nums.length-2; i++){
            if(nums[i]==key){
                map.put(nums[i+1], map.getOrDefault(nums[i+1],0)+1);
                if(max < map.get(nums[i+1])){
                max = Math.max(max, map.get(nums[i+1]));
                ans = nums[i+1];
            }
            }
        }
        return ans;
    }
}