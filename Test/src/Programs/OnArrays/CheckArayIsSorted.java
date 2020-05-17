package Programs.OnArrays;

public class CheckArayIsSorted {

    public static void main(String args[]) {

        // int[] arry = {1, 20, 27, 89, 91, 76};

        int[] arry = {-5, -2, 0, -1};

        int n = arry.length;
        boolean result = checkArrayIsSortedOrNOT(arry, n);
        if (result)
            System.out.println("Array is sorted");
        else
            System.out.println("Given Array is not sorted");
    }

    static boolean checkArrayIsSortedOrNOT(int[] a, int n){
            if(n==1 || n==0)
                return true;

            for(int i=0; i < n-1; i++) {
                if (a[i] > a[i + 1])
                return false;
            }
            return true;
        }
    }

