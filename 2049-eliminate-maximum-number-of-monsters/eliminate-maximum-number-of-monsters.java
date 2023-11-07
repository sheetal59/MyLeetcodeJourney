class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int [] monsterArrivalTime = new int[n];
        for(int i=0; i<n; i++){
            monsterArrivalTime[i] = (dist[i]-1)/ speed[i];
        }
        Arrays.sort(monsterArrivalTime);

        for(int i=0; i<n; i++){
            if(i>monsterArrivalTime[i]){
                return i;
            }
        }
    return n;
    }
}