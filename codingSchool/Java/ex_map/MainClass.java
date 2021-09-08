package ex_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        Map<String, Integer> result = new HashMap<String, Integer>();   // HashSet 와 HastMap 차이점은, HashSet 은 input 이 하나
        // A Map is an object that maps keys to values
        result.put("Martin", 35);
        result.put("Kenneth",72);
        result.put("Jov", 70);
        result.put("Jov2", 70);

        System.out.println(result.get("Martin"));    // checks Martin's result
        System.out.println(result.size());           // check number of results // HashMap does not allow repeated inputs(String)

        Set<String> results = result.keySet();      // set 와 keySet 는 한 묶음
        // keySet() method is used to create a set out of the key elements contained in the hash map. keySet() method is used to get only the list of keys in HashMap.
        for ( String object : results ) {   // object has only acquired names(String) not Integer
            System.out.println(object  + "  " + result.get(object));    // result.get() 위와 같이 동일하다
        }

        for ( Map.Entry<String, Integer> object2 : result.entrySet()) { // the reason why it's Map is because, it contains more than 1 inputs(String and Integer)
            System.out.println(object2.getKey() + object2.getValue());
            // keySet() method is used to get only the list of keys in HashMap.
            // entrySet() method is used to get both key and values from the HashMap.
        }

        // set 와 keySet 는 한 묶음
        // entry 와 entrySet 는 한 묶음
        // Map 와 HashMap 는 한 묶음

    }
}
