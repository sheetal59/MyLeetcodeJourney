class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i =0; i<nums.length; i++){
            int first = nums[i];
            while(first>9){
                first/=10;
            }
            for(int j = i+1; j<nums.length; j++){
                if(gcd(first, nums[j]%10)==1){
                    count++;
                }
            }
        }
        return count;
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}