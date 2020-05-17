package Programs.algorithims;

import java.util.Arrays;

public class FindNuniqueIntegersSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find_N_UniqueIntegers(5)));
    }

    public static int[] find_N_UniqueIntegers(int n) {
        int[] res = new int[n];
        for (int i = 1; i < n; i++) {
            res[i] = i;
            res[0] = res[0] - i;
        }
        return res;
    }

}

// 5
