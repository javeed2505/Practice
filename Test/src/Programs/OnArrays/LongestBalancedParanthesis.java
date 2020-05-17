package Programs.OnArrays;

import java.util.Stack;


public class LongestBalancedParanthesis {

        public static int getLongestValidParenthesesLength(String str) {
            Stack<Integer> indexes = new Stack<>();
            indexes.push(-1);

            int counter = 0;
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == '(') {
                    indexes.push(i);

                } else {
                    indexes.pop();
                    if (!indexes.isEmpty()) {
                        counter = Math.max(counter, i - indexes.peek());
                    } else {
                        indexes.push(i);
                    }
                }
                i++;
            }
            return counter;
        }

        public static void main(String[] args) {
            String str = "))(()";
            System.out.println(getLongestValidParenthesesLength(str));
        }

    }
