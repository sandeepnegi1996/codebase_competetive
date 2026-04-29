// ** Find the first non repeating character 
// ** example in the below mentioned string there are multiple characters that are repeated but i want the first character that is repeated 

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        
        String name= "ssaannddep";

        // with hashmap we can find the frequency but we will lost the order with linkedHashMap the order will be maintained.

     char []arr = name.toCharArray();

     LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
     for (int i = 0; i < arr.length; i++) {


        if (map.containsKey(arr[i])) {

            map.put(arr[i], map.get(arr[i])+1);
            
        }else {
            map.put(arr[i],1);
        }
        

     }

     map.forEach((k,v)->{

        System.out.println(k+"  :   "+v);
     });


     //       Set<Map.Entry<Integer,Integer>> entries=  map.entrySet();

Optional<Character> optionalIsFirstNonRepeating = map.entrySet().stream()
        .filter(entry -> entry.getValue().equals(1) )
        .map(Map.Entry::getKey)
        .findFirst();

    

    System.out.println(optionalIsFirstNonRepeating);
    }
}
