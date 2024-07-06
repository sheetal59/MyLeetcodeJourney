class Solution {
    public int passThePillow(int n, int time) {
        int currpos =1;
        int currTime =0;
        int direction =1;
        while(currTime<time){
            if(0<currpos + direction && currpos +direction <=n){
                currpos += direction;
                currTime++;
            }else{
                direction *=-1;
            }
        }
        return currpos;
    }
}