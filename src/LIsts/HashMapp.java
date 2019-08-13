package LIsts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapp {

    public static void main(String[] args) {
        Map<String, String> info = new HashMap<>();
        info.put("name", "James Bond");
        info.put("phone", "312-312-5444");
        info.put("name", "John Wick");
        System.out.println(info);
        System.out.println(info.get("name"));
        Set<String> myKeys = info.keySet();
        System.out.println(myKeys);
        for(String key: myKeys){
            System.out.println(info.get(key));
        }
    }
}
