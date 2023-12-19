class Solution {
    public int[] replaceElements(int[] arr) {
        int max =-1;
        int temp[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            temp[i]= max;
            max = Math.max(arr[i],max);
        }
        return temp;
    }
}