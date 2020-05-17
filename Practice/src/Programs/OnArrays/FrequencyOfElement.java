package Programs.OnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyOfElement {


    //private static Object alist;

    public static void main(String[] args) {

        List<Character> alist = new ArrayList<Character>();

//        alist.add('a');
//        alist.add('b');
//        alist.add('c');
//        alist.add('a');
//        alist.add('d');
//        alist.add('e');

        addElements((ArrayList<Character>) alist, 'a');
        addElements((ArrayList<Character>) alist, 'b');
        addElements((ArrayList<Character>) alist, 'd');
        addElements((ArrayList<Character>) alist, 'b');

        countFreqElements((ArrayList<Character>) alist, 'b');

    }

    // function to insert elements
    public static void addElements(ArrayList<Character> clist, char c)
    {
        clist.add(c);
    }

    //function to count frequency of elements
    public static void countFreqElements(ArrayList<Character> clist, char c){

        if(clist.contains(c)) {
            System.out.println(Collections.frequency(clist,c));
        }

        else{
            System.out.println(" element not present");
        }

    }


}
