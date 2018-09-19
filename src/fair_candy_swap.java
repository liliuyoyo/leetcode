/**
 * 888. Fair Candy Swap
 *
 * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.

 Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)

 Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.

 If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
 */

public class fair_candy_swap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        for(int i:A){
            sumA += i;
        }
        int sumB=0;
        for(int j:B){
            sumB += j;
        }
        int n = (sumA-sumB)/2;
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i]- n == B[j]){
                    return new int[]{A[i],B[j]};
                }

            }
        }
        return new int[0];
    }
}
