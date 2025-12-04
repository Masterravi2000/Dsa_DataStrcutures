package HashMaps;

import java.util.Map;
import java.util.LinkedHashMap;

public class Basics {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Akash", 21);
        map.put("Gautam", 22);
        map.put("Abhilash", 23);

        //you need to loop through the hashmap in order to display its value
        for(Map.Entry<String, Integer> set : map.entrySet()){
            System.out.println("His name is "+set.getKey()+" and his age is  "+set.getValue());
        }
        System.out.println(map.remove("Akash"));
          for(Map.Entry<String, Integer> set : map.entrySet()){
            System.out.println("His name is "+set.getKey()+" and his age is  "+set.getValue());
        }
        System.out.println(map.keySet());
    }
}
