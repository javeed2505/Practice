package Programs.algorithims;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRight {

    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};
        // int[] nums = {};
        System.out.println(" The resulted array is: " + Arrays.toString(replaceElementsWithGreatest(nums)));
    }

    public static int[] replaceElementsWithGreatest(int[] nums) {

        if (nums == null || nums.length == 0)
            return new int[]{};

        int max = 0;
        int n = nums.length;
        int[] res = new int[n];
        res[n - 1] = -1;

         for (int i = n - 2; i >= 0; i--) {
                max = Math.max(max, nums[i+1]);
                res[i] = max;
            }
            return res;
        }


    }






