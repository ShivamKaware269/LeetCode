class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        int val = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Forward
            for(int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = val++;
            }

            rowStart++;

            // Downward
            for(int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = val++;
            }

            colEnd--;

            if (rowStart <= rowEnd) {
                // Backwards
                for(int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = val++;           
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                // Upwards
                for(int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = val++;
                }

                colStart++;
            }
        }

        return matrix;
    }
}