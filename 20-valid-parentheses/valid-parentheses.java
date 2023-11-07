class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            //opening condition
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                //check if the stack is empty--- if yes return false
                if(st.isEmpty()){
                    return false;
                }else{
                    //check for closing condition by peeking the top of stack
                    if((st.peek()=='(' && ch==')')||
                    (st.peek()=='{' && ch=='}') ||
                    (st.peek()=='[' && ch==']')){
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        //check if the stack is empty or not, if yes return true otherwise false
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}