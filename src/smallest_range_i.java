public class smallest_range_i {
    public int smallestRangeI(int[] A, int K) {
        int min=A[0];
        int max=A[0];
        for(int i=0; i<A.length;i++){
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }
        int result= (max-min)-2*K;
        return result < 0 ? 0:result;
    }
}
