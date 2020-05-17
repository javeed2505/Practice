package Programs.CollectionsBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("Javeed",1000);
        hmap.put("Shabnam", 10001);
        hmap.put("Jameer", 999);
        hmap.put("Habeeb", 1500);
        System.out.println(printNames(hmap));
    }

    static int printNames(HashMap<String,Integer> hmp) {
        Set<Map.Entry<String, Integer>> mpset = hmp.entrySet();
        int max = 0;
        int secondMax =0;
        for (Map.Entry<String, Integer> m1 : mpset) {
            if (m1.getValue() > secondMax) {
                max = m1.getValue();
                secondMax = max;
            }
        }
        return secondMax;
    }

}


