class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i =0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int num : nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        int[] result = new int[set2.size()];
        int i=0;
        for(int num : set2){
            result[i++] = num;
        }
        return result;
    }
}