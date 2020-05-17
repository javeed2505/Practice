package Programs.OnArrays;

import java.util.HashSet;

public class PrintUniqueElements {

    public static void main(String args[]){
        int[] a = {1,7,3,8,8,9,2,0};
        System.out.println(findUniqueElements(a));
    }

    public static HashSet<Integer> findUniqueElements(int[] arry){
        HashSet<Integer> hset = new HashSet<Integer>();

        for(int i=0; i<arry.length; i++){

            if(!hset.contains(arry[i])) {
                hset.add(arry[i]);
            }
        }
        return hset;
    }

}
