class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int range = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=range; i++){
            map.put(i,0);
        }
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
        }
        for(int n : map.keySet()){
            if(map.get(n)==0){
                ans.add(n);
            }
        }
        return ans;
    }
}