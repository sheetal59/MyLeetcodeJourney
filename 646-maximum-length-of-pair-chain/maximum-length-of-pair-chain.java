class Solution {
    public int findLongestChain(int[][] pairs) {
        //sort on the basis of 2nd number
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        //initiliaze the max length with 1 for the first pair
        int maxChainLength=1;
        int pairEnd = pairs[0][1];
        for(int i=0; i<pairs.length; i++){
            //check whether the next pair doesnt overlap with the first one
            //for no overlapping the second pair much start must be greater than the first pair end
            if(pairs[i][0]>pairEnd){
                maxChainLength++;
                pairEnd = pairs[i][1];
            }
        }
        return maxChainLength;
    }
}