package Programs.OnArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindFourthSmallest {
    public static void main(String[] args) {
        int arr[] = {10,7,1,5,3,0};
        int k=4;
        System.out.println(findFourthSmallet(arr, k));
    }

    public static int findFourthSmallet(int arry2[], int n){
        Arrays.sort(arry2);
        return arry2[n-1];
    }

}
