class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        //edge case when starting and ending cells are same
        if(sx==fx && sy==fy){
            return t!=1;
        }
       // if(t==1){
         //   return true;
        //}
        //The chebysev distance is-- max(x2-x1, y2-y1)
       int distToReach = Math.max(Math.abs(sx-fx), Math.abs(sy-fy));
        //condition
        if(t>=distToReach){
            return true;
        }
    return false;
    }
}