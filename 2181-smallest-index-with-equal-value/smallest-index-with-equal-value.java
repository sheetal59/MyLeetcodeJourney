class Solution {
    public int smallestEqual(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int ans = i%10;
            if(ans==nums[i]){
                al.add(i);
            }
        }
        Collections.sort(al);
        if(al.size()==0){
            return -1;
        }
        return al.get(0);
    }
}