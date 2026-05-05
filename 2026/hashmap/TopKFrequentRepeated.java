//problem statement 
// Input: arr[] = [3, 1, 4, 4, 5, 2, 6, 1], k = 2
// Output: [4, 1]
// Explanation: Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency.

// 3-1, 1-2 , 4-2 , 5-1 , 2-1, 6-1 

// Input: arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4
// Output: [5, 11, 7, 10]
// Explanation: Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, and frequency of rest is 1  but 10 is largest .

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentRepeated {


    static class Compare implements Comparator<int []> {

        @Override
        public int compare(int[] o1, int[] o2) {
       

            return Integer.compare(o2[1],o1[1]);

        }


    
}

    public static void main(String[] args) {
        
        int arr[] = {3, 1, 4, 4, 5, 2, 6, 1};
        int topMostFrequent = 3;

        HashMap<Integer,Integer> map =  new HashMap<>();

        for (int i = 0; i < arr.length; i++) 
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        
        ArrayList<int []> freqencArrayList = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
            int key =  entry.getKey();
            int value = entry.getValue();
            freqencArrayList.add(new int[]{key,value});
        }

        freqencArrayList.sort(new Compare());

        for( int[] element: freqencArrayList) {
            System.out.println(element[0]+" "+element[1]);
        }

        // get the top three elements 

        ArrayList<Integer> finalArrayList = new ArrayList<>();

        for(int i=0;i<topMostFrequent;i++) {

         

            finalArrayList.add(freqencArrayList.get(i)[0]);

        }

        System.out.println(finalArrayList);

    }
    
}

