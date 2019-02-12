import java.util.Arrays;

public class next_closest_time {
    static int flag = 0;

    public static String nextClosestTime(String time) {
        char[] result = time.toCharArray();
        char[] digits = time.replace(":","").toCharArray();
        Arrays.sort(digits);

        for(int i=result.length-1; i>= 0; i--){
            if(i == 2) continue;
            result[i] = findNextChar(result,digits,digits.length,i);
            if(flag == 1) break;
        }
        return String.valueOf(result);
    }

    public static char findNextChar(char[] result,char[] digits,int n,int i){
        // find the number position in digits array.
        int index = 0;
        for(int j=0; j< digits.length; j++){
            if(digits[j] == result[i]){
                index = j;
            }
        }

        if(i == 4){
            if(index < n-1 && digits[index] < digits[index+1]) {
                flag = 1;
                return digits[index+1];
            }else return digits[0];
        }


        if(i == 3){
            if(result[i] == '4') return digits[0];
            else {
                if(index < n-1 && digits[index+1] < '5') {
                    flag = 1;
                    return digits[index+1];
                }else return digits[0];
            }
        }

        if(i == 1){
            if(result[i-1] == '2'){
                if(result[i] == '3') {
                    return digits[0];
                }else {
                    if(index < n-1 && digits[index+1] < '4'){
                        flag = 1;
                        return digits[index+1];
                    }else return digits[0];
                }
            }else{
                if(index < n-1) {
                    flag = 1;
                    return digits[index+1];
                }
            }
        }
        return digits[0];
    }

    public static void main(String[] args) {
        System.out.println(nextClosestTime("02:42"));
    }
}
