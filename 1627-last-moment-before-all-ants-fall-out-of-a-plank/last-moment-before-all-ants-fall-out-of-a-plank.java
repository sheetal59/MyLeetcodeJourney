class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        // Find the farthest position among ants moving to the left.
        int maxLeft = Arrays.stream(left).max().orElse(0);
        
        // Find the nearest position among ants moving to the right.
        int minRight = n - Arrays.stream(right).min().orElse(n);
        
        // Calculate the time when the last ant(s) fall.
        return Math.max(maxLeft, minRight);
    }
}