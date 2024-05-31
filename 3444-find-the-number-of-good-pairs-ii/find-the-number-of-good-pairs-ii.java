class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num :nums2){
            map.put(num*k, map.getOrDefault(num*k,0)+1);
        }
        long count =0;
        for(int num:nums1){
            for(int i=1; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    int complement = num/i;
                    if(map.containsKey(i)){
                        count += map.get(i);
                    }
                    if(complement !=i && map.containsKey(complement)){
                        count += map.get(complement);
                    }
                }
            }
        }
        return count;
    }
}