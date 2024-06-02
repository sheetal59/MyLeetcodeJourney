class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map1.put(c,i);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i =0; i<t.length(); i++){
            char c = t.charAt(i);
            map2.put(c,i);
        }
        int ans=0;
        for(char c : map1.keySet()){
            ans += Math.abs(map1.get(c)-map2.get(c));
        }
        return ans;
    }
}