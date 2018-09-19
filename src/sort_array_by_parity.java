public class sort_array_by_parity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length-1;
        while(i<=j){
            if(A[i] % 2 ==0){
                i++;
            }
            else{
                int temp= A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
            }
        }
        return A;
    }
}
