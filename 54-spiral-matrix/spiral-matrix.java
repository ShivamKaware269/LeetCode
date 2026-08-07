class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;

        List<Integer> answer = new ArrayList<>();

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Forward
            for(int i = colStart; i <= colEnd; i++) {
                answer.add(matrix[rowStart][i]);
            }

            rowStart++;

            // Downward
            for(int i = rowStart; i <= rowEnd; i++) {
                answer.add(matrix[i][colEnd]);
            }

            colEnd--;

            if (rowStart <= rowEnd) {
                // Backwards
                for(int i = colEnd; i >= colStart; i--) {
                    answer.add(matrix[rowEnd][i]);           
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                // Upwards
                for(int i = rowEnd; i >= rowStart; i--) {
                    answer.add(matrix[i][colStart]);
                }

                colStart++;
            }
        }
        return answer;

    }
}