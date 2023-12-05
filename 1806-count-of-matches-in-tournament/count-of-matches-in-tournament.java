class Solution {
    public int numberOfMatches(int n) {
       // return n-1;
        int matchesPlayed=0;
        while(n>1){
            matchesPlayed += n/2;
            n = (n+1)/2;
        }
        return matchesPlayed;
    }
}