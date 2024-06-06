class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        for(String s : words){
            if(s.indexOf(pref)==0){
                count++;
            }
        }
        return count;
    }
}