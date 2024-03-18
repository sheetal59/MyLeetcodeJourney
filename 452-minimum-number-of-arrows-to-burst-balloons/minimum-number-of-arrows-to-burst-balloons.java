class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> Integer.compare(a[0],b[0]));
        int last = points[0][1];
        int arrow =1;
        for(int i=0; i<points.length; i++){
            if(points[i][0]>last){
            arrow++;
            last = points[i][1];
            }else{
            last = Math.min(last, points[i][1]);
        }
        }
        
        return arrow;
    }
}