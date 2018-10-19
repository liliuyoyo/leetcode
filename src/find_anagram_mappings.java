public class find_anagram_mappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] P = new int[A.length];
        for(int i=0; i< A.length; i++){
            for(int j=0; j<B.length;j++){
                if(B[j]==A[i]){
                    P[i]=j;
                }
            }
        }
        return P;
    }
}
