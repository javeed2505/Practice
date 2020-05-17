package Programs.algorithims;


/* Given an array A of positive integers, let S be the sum of the digits of the minimal element of A.
    Return 0 if S is odd, otherwise return 1.

 */

public class LeetCode1085 {

    public static void main(String[] args) {
        int[] nums = {99,77,33,66,55};
        System.out.println(getSumOfTheDigitsOfMinimalElement(nums));
    }

    public static int getSumOfTheDigitsOfMinimalElement(int[] input){

        int min = Integer.MAX_VALUE;

        // Logic to find the Lowest element
        for (int i = 0; i < input.length; i++){
            if (input[i] < min){
                min = input[i];
            }
        }

        // Convert the integer to String
        String min_str = Integer.toString(min);
        int s = 0;

        // Logic to calculate the sum of the digits of a lowest element.
        for(int k=0;k<min_str.length();k++){
            s += Character.getNumericValue(min_str.charAt(k));
        }

        if (s%2 == 0){
            return 1;
        }
        else
            return 0;
    }
}
