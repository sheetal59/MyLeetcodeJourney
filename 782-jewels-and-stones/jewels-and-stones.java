class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        StringBuilder str = new StringBuilder();
        str.append(jewels);
        for(char c : stones.toCharArray()){
            if(str.toString().contains(String.valueOf(c))){
                count++;
            }
        }
        return count;
    }
}