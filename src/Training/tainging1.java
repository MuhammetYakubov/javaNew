package Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class tainging1 {
    public static void main(String[] args) {

    }
    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
            return map;
        }else {
            return map;
        }
    }//
}


