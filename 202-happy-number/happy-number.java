class Solution {
    public boolean isHappy(int n) {
        int slow =n;
        int fast =n;
        do{
            slow = sq(slow);
            fast = sq(sq(fast));
        } while(slow!=fast);

        return slow == 1;
    }
    public int sq(int num){
        int ans=0;
        while(num>0){
            int ld = num%10;
            ans += ld *ld;
            num /= 10;
        }
        return ans;
    }
}