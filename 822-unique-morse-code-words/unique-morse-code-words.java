class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
        "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                sb.append(code[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}