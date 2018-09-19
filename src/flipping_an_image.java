/**
 * 832.Flipping an Image
 *
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

 To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

 To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

 Example 1:

 Input: [[1,1,0],[1,0,1],[0,0,0]]
 Output: [[1,0,0],[0,1,0],[1,1,1]]
 Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 Example 2:

 Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 Notes:

 1 <= A.length = A[0].length <= 20
 0 <= A[i][j] <= 1
 */


public class flipping_an_image {

    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] a:A){
            for(int i=0;i<a.length/2;i++){
                int tmp=a[i];
                a[i] = a[a.length-1-i];
                a[a.length-1-i]=tmp;
            }

            for(int j=0;j<a.length;j++){
                if(a[j]==0){
                    a[j]=1;
                }else{
                    a[j]=0;
                }
            }
        }
        return A;
    }
}

/**
 *
 *
 public int[][] flipAndInvertImage(int[][] A) {
    int C = A[0].length;
    for (int[] row: A)
        for (int i = 0; i < (C + 1) / 2; ++i) {
            int tmp = row[i] ^ 1;
            row[i] = row[C - 1 - i] ^ 1;
            row[C - 1 - i] = tmp;
        }
    return A;
 }
 *
 */
