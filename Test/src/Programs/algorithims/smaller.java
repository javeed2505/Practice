package Programs.algorithims;

import java.util.ArrayList;

class Solution {

        public static void main(String[] args) {
            int[] a={2,5,0,9,10,12};
            System.out.println(smallerNumbersThanCurrent(a));
        }
        
        public static ArrayList<Integer> smallerNumbersThanCurrent(int[] nums) {
            ArrayList<Integer> al = new ArrayList<Integer>();

            for(int i = 0; i < nums.length; i++) {
                int smallerCount = 0;
                for(int j = 0; j < nums.length; j++) {
                    if(nums[j] < nums[i]) {
                        smallerCount++;
                    }
                }
                al.add(smallerCount);
            }
            return al;
        }
    }

