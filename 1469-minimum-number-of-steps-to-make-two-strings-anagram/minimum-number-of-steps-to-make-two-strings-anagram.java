class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            smap.put(a,smap.getOrDefault(a,0)+1);
        }
        int ans =0;
        for(int i=0; i<t.length(); i++){
            char b = t.charAt(i);
            if(smap.containsKey(b) && smap.get(b)>0){
                smap.put(b,smap.get(b)-1);
            }
            else{
                ans++;
            }
        }
    return ans;

    }
}