import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class main {


    public static int[] hasPairWithSum(int[] nums,  int sum){

        if(nums.length == 0){
            return null;
        }

        int startIndex = 0;
        int endIndex = nums.length -1;

        while(startIndex < endIndex) {
            if (nums[startIndex] + nums[endIndex] == sum) {
                return new int[]{nums[startIndex], nums[endIndex]};
            }

            if (nums[startIndex] + nums[endIndex] < sum) {
                startIndex++;
            } else {
                endIndex--;
            }
        }

        return null;
    }

    public static boolean hasPairWithSumUnsorted(int[] nums,  int sum){
        HashSet<Integer> seen = new HashSet<>();

        for(int num:nums){
            int comp = sum-num;
            if(seen.contains(comp)){
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[]args){
       int[] solution = hasPairWithSum(new int[]{1,2,4,5,8,9}, 12);
       System.out.println(Arrays.toString(solution));

       System.out.println(hasPairWithSumUnsorted(new int[]{1,9,8,5,4,2}, 12));
    }
}
