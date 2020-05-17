package Programs.algorithims;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2 {

    public static void main(String[] args) {
        int[] a={2,5,0,9,10,12};
    }




    public static void smallerNumbersThanCurrent(int[] nums) {
            int[] temp = Arrays.copyOf(nums,nums.length);
            Arrays.sort(temp);

            Map<Integer,Integer> map = new HashMap<>();
            int count = 0;
            for(int num : temp) {
                if(!map.containsKey(num)) {
                    map.put(num, count);
                }
                count++;
            }

            int[] output = new int[nums.length];
            for(int i = 0; i < nums.length; i++) {
                output[i] = map.get(nums[i]);
                System.out.println(output[i]);

            }


        }
    }

