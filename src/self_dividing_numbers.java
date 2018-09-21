import java.util.ArrayList;
import java.util.List;

public class self_dividing_numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=left; i <= right; i++){
            if (String.valueOf(i).contains("0")){
                continue;
            }else{
                int temp=i,flag=0;
                while(temp >0 && flag==0){
                    if(i % (temp%10) != 0){
                        flag = 1;
                    }
                    temp = temp/10;
                }
                if(flag==0){
                    result.add(i);
                }
            }
        }
        return result;
    }

    /*public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)) break;
            }
            if (j == 0) list.add(i);
        }
        return list;
    }*/
}
