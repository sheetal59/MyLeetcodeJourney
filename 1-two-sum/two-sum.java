class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j])==target){
                    ans.add(i);
                    ans.add(j);
                    break;
                }

            }
        }
        int anss[] = new int[2];
        for(int i=0; i<ans.size(); i++){
            anss[i] = ans.get(i);
        }
        return anss;
    }
}