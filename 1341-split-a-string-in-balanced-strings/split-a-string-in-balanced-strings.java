class Solution {
    public int balancedStringSplit(String s) {
        int i=0;
        int j=0;
        int count =0;
        for(int k=0; k<s.length(); k++){
            char c = s.charAt(k);
            if(c=='L'){
                i++;
            }
            else{
                j++;
            }
            if(i==j){
                count++;
            }
        }
        return count;
    }
}