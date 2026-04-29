import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        
       
                
        int []arr ={1,2,3,4,5,1,2,3,1,1,1,5};

        HashMap<Integer,Integer> map =  new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
         
         if (map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i])+1);
            
         }else {
            map.put(arr[i], 1);
         }

        }


        List<Integer> duplicateElementlist =  map.entrySet().stream()
        .filter(e -> e.getValue().equals(2))
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());

        System.out.println(duplicateElementlist);


    }
}
