package Programs.algorithims;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class CreateTargetArrayWithGivenOrder {

    private static Object Integer;

    public static void main(String[] args) {
        int[] nums = {5,9,0,3,0};
        int[] index = {0, 1, 2, 3, 0};
        System.out.println(findTargetArray(nums, index));
    }

    public static ArrayList<java.lang.Integer> findTargetArray(int[] nums, int[] index){
        List<Integer> al = new ArrayList<Integer>();
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            al.add(index[i], nums[i]);
        }
        return (ArrayList<Integer>) al;
    }
}
