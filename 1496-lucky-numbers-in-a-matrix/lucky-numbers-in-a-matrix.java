class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        
        for (int i = 0; i < n; i++) {
            // Find the minimum element in the current row
            int rowMin = Integer.MAX_VALUE;
            int rowMinIndex = -1;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    rowMinIndex = j;
                }
            }
            
            // Check if the minimum element is the maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][rowMinIndex] > rowMin) {
                    isLucky = false;
                    break;
                }
            }
            
            if (isLucky) {
                ans.add(rowMin);
            }
        }
        
        return ans;
    }
}