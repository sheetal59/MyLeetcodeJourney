class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int count =0;
        for(int i=0; i<words1.length; i++){
            map1.put(words1[i], map1.getOrDefault(words1[i],0)+1);
        }
        for(String word : words2){
            if(map1.containsKey(word) && map1.get(word)==1){
                map2.put(word, map2.getOrDefault(word,0)+1);
            }
        }
        for(String word : map2.keySet()){
            if(map2.get(word)==1){
                count++;
            }
        }
        return count;
    }
}