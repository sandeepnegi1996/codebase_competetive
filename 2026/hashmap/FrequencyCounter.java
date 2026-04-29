//problem statement 
// 1. find the frequency of each element in an array 
// 2. find the element which is most frequent 

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FrequencyCounter {

     public static void main(String[] args) {
        
        int []arr ={1,2,3,4,5,1,2,3,1,1,1};

        HashMap<Integer,Integer> map =  new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
         
         if (map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i])+1);
            
         }else {
            map.put(arr[i], 1);
         }
         


        }

        map.forEach((k,v)->{
         System.out.println("key is :  "+k +" value is :  "+v);
        });


        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
         System.out.println(entry.getKey()+"   :  "+entry.getValue());
        }




       

     }
}