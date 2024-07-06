class Solution {
    public boolean isPalindrome(int x) {
        int p =x;
        int rev = 0;
        if(x<0){
            p = (-1)*p;
        }
        while(p>0){
            int ld = p%10;
            rev = (rev*10) + ld;
            p = p/10;
        }
        if(x==rev){
            return true;
        }
        return false;
    }
}