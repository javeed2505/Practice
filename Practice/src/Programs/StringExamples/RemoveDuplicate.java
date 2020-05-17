package Programs.StringExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "javeedd";
        char[] charArry = str.toCharArray();
        System.out.println(removeDuplicates(charArry));
    }

    public static String removeDuplicates(char[] chars) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
        for (int i = 0; i < chars.length; i++) {
            lhs.add(chars[i]);
        }
        
        Iterator it = lhs.iterator();
        String subStr = "" ;

        while (it.hasNext()) {
            subStr += it.next();
        }
        return subStr;

    }
}