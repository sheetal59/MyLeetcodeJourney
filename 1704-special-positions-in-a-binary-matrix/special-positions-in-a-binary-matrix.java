class Solution {
  public int numSpecial(int[][] mat) {
    var m = mat.length;
    var n = mat[0].length;

    var rows = new int[m];
    var cols = new int[n];

    for (var i=0; i<m; i++) {
      for (var j=0; j<n; j++) {
        rows[i] += mat[i][j];
        cols[j] += mat[i][j];
      }
    }
    var ans = 0;

    for (var i=0; i<m; i++)
      for (var j=0; j<n; j++)
        if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1)
          ans++;

    return ans;
  }
}