class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        HashSet<Character> vo = new HashSet<>();
        vo.add('a');
        vo.add('e');
        vo.add('i');
        vo.add('o');
        vo.add('u');
        vo.add('A');
        vo.add('E');
        vo.add('I');
        vo.add('O');
        vo.add('U');

        int i=0;
        int j= str.length-1;
        while(i<j){
            if(vo.contains(str[i])){
                if(vo.contains(str[j])){
                    char temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return String.valueOf(str);
    }
}