import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null || nums.length == 0) return ans;

        ArrayList<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        ans.add(first);

        for(int i=1; i<nums.length; i++){
            int size = ans.size();
            while(size > 0){
                List<Integer> prev = ans.remove(0);
                for(int j=0; j<prev.size()+1;j++){
                    prev.add(j,nums[i]);
                    List<Integer> newL = new ArrayList<>();
                    newL.addAll(prev);
                    ans.add(newL);
                    prev.remove(j);
                }
                size--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i));
        }
    }
}
