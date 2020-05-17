package Programs.OnArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMaxElement {
    public static void main(String[] args) {
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("abc",100);
        hmap.put("def",10);
        hmap.put("ghi",40);
        hmap.put("jkl",300);

        List<Integer> lst;
        lst = new ArrayList<Integer>(hmap.values());

        int max=0;

        for(Integer a:lst)
            if (a > max) {
                max = a;
            }
        System.out.println(max);

    }
}
