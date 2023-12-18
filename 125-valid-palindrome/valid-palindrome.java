class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list = new ArrayList<>();
        s = s.toLowerCase();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                list.add(ch);
            }
        }
        for(int i=0; i<list.size()/2;i++){
            if(list.get(i)!=list.get(list.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}