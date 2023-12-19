class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int filter[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int sum=0;
                int count=0;

                for(int x=i-1; x<=i+1;x++){
                    for(int y=j-1; y<=j+1;y++){
                        if(x>=0 && y>=0 && x<m && y<n){
                            sum = sum + img[x][y];
                            count +=1;
                        }
                    }
                }
                filter[i][j] = sum/count;
            }
        }
        return filter;
    }
}