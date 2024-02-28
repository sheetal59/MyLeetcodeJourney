class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area=0;
        int left =0;
        int right = n-1;
        if(n<2){
            return 0;
        }
        while(left<right){
           area = Math.max(area, (right-left) * Math.min(height[left], height[right]));
        if(height[left]<height[right]){
            left++;
        } 
        else{
            right--;
        }

        }
        
        return area;
    }
}