package Programs.OnArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FindSmallElement {

    public static void main(String[] args) {
        int[] arry = {0, 5, 23, 50,-2, 300};
        System.out.println(findSmallest(arry));
    }

    public static int findSmallest(int[] num) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < small) {
                small = num[i];
            }
        }
        return small;
    }


}

