class Solution {
    public int reverse(int x) {
        int p =x;
        long rev =0;
        if(x<0){
            p = (-1)*p;
        }
        while(p>0){
           int ld = x%10;
           rev = (rev*10) + ld;
           x = x/10; 
           p = p/10;

        }
        if( rev<Math.pow(-2,31) || rev>Math.pow(2,31)){
            return 0;
        }
        else{
            return (int)rev;
        }
        
    }
}