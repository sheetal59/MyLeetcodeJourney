class Solution {
    public int numSubarraysWithSum(int[] A, int target) {
        Map<Integer, Integer> presum = new HashMap<>();
	//Prefix sum
        int sum = 0;
	//Answer
        int total = 0;
        for (int i = 0; i < A.length; i++){
            sum += A[i];
            if (presum.get(sum - target) != null){
                total += presum.get(sum - target);
            }
            if (sum == target) total++;
            //Also put this sum into the map as well
            presum.put(sum, presum.getOrDefault(sum, 0) + 1);
        }
        
        return total;
        
    }
}