class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num) == 1){
                ans.add(num);
            }
        }
        int[] ans1 = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans1[i] = ans.get(i);
        }
        
        return ans1;
    }
}