class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        int[][] temp = new int[n][n];

        // rotate and store in temp matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                temp[j][n - 1 - i] = matrix[i][j];
            }
        }

        // copy back to original matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = temp[i][j];
            }
        }
    }
}