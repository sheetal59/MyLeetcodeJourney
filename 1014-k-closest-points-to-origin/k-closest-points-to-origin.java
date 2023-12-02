class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int result[][] = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->o1[1]-o2[1]);
        for(int i=0; i<points.length; i++){
            int arr[] = new int[2];
            arr[0] = i;
            arr[1] = (int)Math.pow(points[i][0],2) + (int)Math.pow(points[i][1],2);
            pq.add(arr);
        }
        for(int i=0; i<k;i++){
            int temp[] = pq.remove();
            result[i]  = points[temp[0]];
        }
        return result;
    }
}