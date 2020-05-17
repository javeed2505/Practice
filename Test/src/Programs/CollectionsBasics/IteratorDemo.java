package Programs.CollectionsBasics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("D");
        al.add("C");
        al.add("E");
        al.add("G");
        al.add("B");
        al.add("B");
        printElements(al);
    }

    public static void printElements(ArrayList<String> lst) {
        Iterator<String> it = lst.iterator();

        while (it.hasNext()) {
            String element = it.next();
            System.out.print(element+ " ");
        }

        System.out.println();

        //Modify the content of a list
        ListIterator<String> lit=lst.listIterator();

        while (lit.hasNext()){
            String element2 = lit.next()+ "+";
            lit.set(element2);
            System.out.print(element2+ " ");
        }

        System.out.println();

        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }


    }

}
