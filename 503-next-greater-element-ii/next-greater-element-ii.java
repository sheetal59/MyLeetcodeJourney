class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[nums.length];
        int n = nums.length;
        for(int i= 2*n-1;i>=0; i--){
            int currIdx = i%n;
            while(!s.isEmpty() && nums[s.peek()] <= nums[currIdx]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[currIdx] = -1;
            }else{
                nextGreater[currIdx] = nums[s.peek()];
            }
            s.push(currIdx);
        }
    return nextGreater;
    }
}