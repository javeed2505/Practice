package Programs.OnArrays;

    public class MaxSubArray {

        public static void main(String[] args) {
            //int[] arry = {-1, 3, -5, 4, 6, -1, 2, -7, 13, -3};
            int[] arry = {4, -2, 6, -10, 8, 1};

            int[] result = findMaxSubArray(arry);
            System.out.println("Start index of sub array is: " + result[0]);
            System.out.println("End index of sub array is: " + result[1]);
            System.out.println("Sum of maximum sub array is: " + result[2]);
        }

        public static int[] findMaxSubArray(int[] arry) {
            int tempSum = 0;
            int maxSum = 0;
            int tempStartIndex = 0;
            int[] result = new int[3];

            for (int i = 0; i < arry.length; i++) {
                tempSum = tempSum + arry[i];
                maxSum =  Math.max(tempSum,maxSum);
                    result[0] = tempStartIndex;
                    result[1] = i;
                    result[2] = maxSum;
                if (tempSum < 0) {
                    tempSum = 0;
                    tempStartIndex = i+1;
                }
            }

            return result;

        }

    }
