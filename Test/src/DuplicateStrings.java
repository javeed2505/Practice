import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateStrings {

    public static void main(String args[]){
        String s1="This is sample program to sample the program multiple sample is";
        String[] s2=s1.split(" ");
        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
        for(String str:s2){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str, 1);
            }
        }
        List<String> keys=new ArrayList<String>(map.keySet());
        for(String key:keys){
            System.out.print(key + " ");
            System.out.println(map.get(key));
        }
    }

}
