class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while(i>=0 || j>=0){
            i= validChar(s,i);
            j = validChar(t,j);
            if(i<0 && j<0){
                return true;
            }
            if(i<0 || j<0){
                return false;
            }
            else if(s.charAt(i) != t.charAt(j)){
                return false;
            }
            i--;
            j--;
        }
        return true;
        
    }
    private int validChar(String str, int end){
        int backspaceCount =0;
        while(end>=0){
            if(str.charAt(end) == '#'){
                backspaceCount++;
            }
            else if(backspaceCount>0){
                backspaceCount--;
            }
            else{
                break;
            }
            end--;
        }
        return end;
    }
}