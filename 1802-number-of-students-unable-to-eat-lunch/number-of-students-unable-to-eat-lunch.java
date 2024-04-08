class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> st = new LinkedList<>();
        Stack<Integer> sa = new Stack<>();

        for(int i=0; i<students.length; i++){
            st.add(students[i]);
        }
        for(int i=0; i<sandwiches.length; i++){
            sa.push(sandwiches[sandwiches.length-i-1]);
        }
        int hungary = 0;
        while(true){
            if(st.peek()==sa.peek()){
                hungary =0;
                st.remove();
                sa.pop();
            }else{
                hungary ++;
                st.add(st.remove());
            }
            if(hungary==st.size()){
                break;
            }
        }
        return hungary;
    }
}