class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        } 
        for(int i=0; i<t.length(); i++){
            char d = t.charAt(i);
            if(map.get(d)!=null){
                if(map.get(d)==1){
                    map.remove(d);
                }else{
                    map.put(d, map.get(d)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}