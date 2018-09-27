import java.util.ArrayList;

public class shortest_distance_to_a_char {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        ArrayList<Integer> charIndex = new ArrayList<>();
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)==C){
                charIndex.add(i);
            }
        }
        for(int i=0; i<result.length; i++){
            if(S.charAt(i)==C){
                result[i]=0;
            }else{
                result[i]=getMinDis(i,charIndex);
            }
        }
        return result;
    }

    public int getMinDis(int i,ArrayList<Integer> index){
        int min=Integer.MAX_VALUE;
        for(Integer n:index){
            min=Math.min(min,Math.abs(i-n));
        }
        return min;
    }
}
