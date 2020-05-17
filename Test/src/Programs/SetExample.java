package Programs;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class SetExample {
    public static void main(String[] args) {

        Integer[] a={1,2,3,4,2,2,5};
        Set<Integer> input_1=new HashSet<Integer>(Arrays.asList(a));

        Integer[] b={1,2,3,4,0,6,7};
        Set<Integer> input_2=new HashSet<Integer>(Arrays.asList(b));

        //Union
        Set<Integer> union  = new HashSet<Integer>(input_1);
        union.addAll(input_2);
        System.out.println("Union of input1 and input2 is:" + union);

        //Intersection
        Set<Integer> intersection  = new HashSet<Integer>(input_1);
        intersection.retainAll(input_2);
        System.out.println("Intersection of input1 and input2 is:" + intersection);

        //Symmetric intersection
        Set<Integer> symmetry  = new HashSet<Integer>(input_1);
        symmetry.removeAll(input_2);
        System.out.println("Symmetric of input1 and input2 is:" + symmetry);

    }


}
