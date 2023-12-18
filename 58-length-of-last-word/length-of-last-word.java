class Solution {
    public int lengthOfLastWord(String s) {
        //removing trailing or leading spaces
        s = s.trim();
        if(s.contains(" ")){
            String str = s.substring(s.lastIndexOf(" "), s.length()-1);
            return str.length();
        }else{
            return s.length();
        }
    }
}