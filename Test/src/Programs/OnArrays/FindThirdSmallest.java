package Programs.OnArrays;

public class FindThirdSmallest {


        public static void thirdSmallestElement(int [] arrA){

            if(arrA.length<3){
                System.out.println("Invalid Input, array size is less than 3");
            }

            int first=Integer.MAX_VALUE;
            int second=Integer.MAX_VALUE;
            int third = Integer.MAX_VALUE;

            for (int i = 0; i <arrA.length ; i++) {
                int current = arrA[i];
                if(first>arrA[i]){
                    third = second;
                    second = first;
                    first = arrA[i];
                }else if(second>arrA[i]){
                    third = second;
                    second = arrA[i];
                }else if(third>arrA[i]){
                    third=arrA[i];
                }
            }
            System.out.println("Third smallest element is: " + third);
        }

        public static void main(String[] args) {
            int [] arrA = { 6, 8, 1, 9, 2, 10};
            thirdSmallestElement(arrA);
        }
    }


