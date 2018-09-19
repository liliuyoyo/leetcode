/**
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

 You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

 The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

 If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.*/

public class reshape_the_matrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n =  nums[0].length;
        if(r*c != m*n){
            return nums;
        }
        int[][] result = new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index = i*n+j;
                result[index/c][index%c]=nums[i][j];
            }
        }
        /**
         * for (int i=0;i<r*c;i++)
         * res[i/c][i%c] = nums[i/m][i%m];
         * return res;
         */
        return result;
    }
}
