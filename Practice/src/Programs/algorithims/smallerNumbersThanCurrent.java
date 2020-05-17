package Programs.algorithims;

import java.util.ArrayList;

public class smallerNumbersThanCurrent {

    public static void main(String[] args) {

        int[] inputArry={1,2,10,0,8,3};
        //findSmallerThanCurrentNumbersCount(inputArry);
        System.out.println(findSmallerThanCurrentNumbersCount(inputArry));

    }

    public static ArrayList<Integer> findSmallerThanCurrentNumbersCount(int[] a){
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count=0;

        for(int i=0; i<a.length;i++ ){
            for(int j=0; j<a.length;j++){
                if(a[j]< a[i]){
                    count+=1;
                }

            }

            al.add(count);

        }

        return al;

    }

}
