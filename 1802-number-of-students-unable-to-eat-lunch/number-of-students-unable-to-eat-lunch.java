class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>(); //Queue of students
        Stack<Integer> s = new Stack<>();  //queue of sandwhiches
        //pushing or adding the array elements into the stack and queue
        for(int i=0; i<students.length; i++){
            q.add(students[i]);
        }
        for(int i=0; i<sandwiches.length; i++){
            s.push(sandwiches[sandwiches.length-i-1]);
        }
        //initialize the count of students who are left hungry
        int hungryCount = 0;
        //check the elements of stack and queue
        while(true){
            if(s.peek()==q.peek()){
                hungryCount=0;
                q.remove();
                s.pop();
            }else{
                hungryCount++;
                q.add(q.remove());
            }
            if(hungryCount==q.size()){
            break;
        }
    }
        
        return hungryCount;
    }
}