class Solution {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<candyType.length; i++){
            set.add(candyType[i]);
        }
        int max2= set.size();
        return Math.min(max,max2);
    }
}