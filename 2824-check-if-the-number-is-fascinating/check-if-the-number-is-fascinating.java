class Solution {
    public boolean isFascinating(int n) {
        int a = 2 * n;
        int b = 3 * n;

        String p = Integer.toString(n);
        String q = Integer.toString(a);
        String r = Integer.toString(b);

        String res = p + q + r;
        
        HashSet<Character> set = new HashSet<>();
        for(char c : res.toCharArray()){
            if(c>='1' && c<='9'){
                if(set.contains(c)){
                    return false;
                }
                set.add(c);
            }else{
                return false;
            }
        }
        return set.size()==9;
    }
}