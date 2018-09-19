/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.

 Example 1:
 Input: [1,1,0,1,1,1]
 Output: 3
 Explanation: The first two digits or the last three digits are consecutive 1s.
 The maximum number of consecutive 1s is 3.
 */
public class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i:nums){
            max = Math.max(max,count = (i == 1 ? count+1 : 0));
        }
        return max;
    }
    /*public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i:nums){

            if(i==1){
                count ++;
            }else{
                if(max <= count){
                    max = count;
                }
                count = 0;
            }
        }
        if(max == 0 || max <= count){
            max = count;
        }
        return max;
    }*/
}
