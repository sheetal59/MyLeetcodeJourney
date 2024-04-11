class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k==0){
            return num;
        }
        if(k==n){
            return "0";
        }
        Stack<Character> s = new Stack<>();
        int i=0;
        while(i<n){
            while(k>0 && !s.isEmpty() && s.peek() > num.charAt(i) ){
            s.pop();
            k--;
            }
            s.push(num.charAt(i++));
        }
        while(k-- >0){
            s.pop();
        }
        String ans = "";
        while(!s.isEmpty()){
            ans = s.pop() + ans;
        }
        while(ans.length()>1 && ans.charAt(0)=='0'){
            ans = ans.substring(1);
        }
        return ans;
    }
}