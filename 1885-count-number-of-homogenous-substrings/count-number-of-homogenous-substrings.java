class Solution {
    public int countHomogenous(String s) {
        int i=0;
        long count=0;
        for(int j=0; j<s.length(); j++){
            if(s.charAt(i) == s.charAt(j)){
                count += j-i+1;
            }else{
                count= count +1;
                i=j;
            }
        }
        return (int)(count %(1000000007));
    }
}