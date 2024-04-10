class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ll = new ArrayList<>();
        for(Integer key : map.keySet()){
            if(map.get(key)> nums.length/3){
                ll.add(key);
            }
        }
        return ll;
    }
}