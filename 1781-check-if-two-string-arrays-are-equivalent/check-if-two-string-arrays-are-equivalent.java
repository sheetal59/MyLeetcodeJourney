class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String i : word1){
            s1.append(i);
        }
        for(String i: word2){
            s2.append(i);
        }
        String str1 = s1.toString();
        String str2 = s2.toString();

        return str1.equals(str2);
    }
}