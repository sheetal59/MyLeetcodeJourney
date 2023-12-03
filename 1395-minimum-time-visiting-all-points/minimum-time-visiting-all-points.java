class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time =0;
        for(int i=1; i<points.length;i++){
            int xDist = Math.abs(points[i-1][0] - points[i][0]);
            int yDist = Math.abs(points[i-1][1] - points[i][1]);
            time += Math.max(xDist, yDist);
        }
        return time;
    }
}