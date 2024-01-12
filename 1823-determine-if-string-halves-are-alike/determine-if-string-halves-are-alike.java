class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for(int i=0; i<s.length(); i++){
            if(i<s.length()/2 && set.contains(s.charAt(i))){
                count++;
            }else if(i>= s.length()/2 && set.contains(s.charAt(i))){
                count--;
            }
            if(count<0){
                return false;
            }
        }
        return count==0;
    }
}