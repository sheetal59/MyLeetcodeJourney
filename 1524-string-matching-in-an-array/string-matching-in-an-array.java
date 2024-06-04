class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String word = words[i];
            for(int j=0; j<words.length; j++){
                if(i!=j && words[j].contains(word)){
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }
}