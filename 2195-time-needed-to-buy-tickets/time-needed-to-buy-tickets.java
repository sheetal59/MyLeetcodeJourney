class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time =0;
        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            int front = q.remove();
            tickets[front]--;
            time++;
            if(tickets[front]==0 && front==k){
                return time;
            }
            if(tickets[front]>0){
                q.add(front);
            }
        }
        return time;
    }
}