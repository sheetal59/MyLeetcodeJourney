class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : amount){
            pq.add(num);
        }
        int ans = 0;
        while(!pq.isEmpty()){
            int first = pq.poll();
            int second = pq.poll();

            if(first<=0 && second<=0){
                break;
            }
            first--;
            second--;
            pq.add(first);
            pq.add(second);
            ans++;
        }
        return ans;
    }
}