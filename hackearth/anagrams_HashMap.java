//anagrams using Arrays sort and Arrays equals method

import java.util.*;

class TestClass
{
    public static boolean checkAnagrams(String s1,String s2)
    {
        

        boolean status=true;
      
            
            HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
            
            for (int i = 0; i < s1.length(); i++) 
            {
                int charcount=0;
                char char1=s1.charAt(i);
                if (map1.containsKey(char1)) 
                {
                    charcount=map1.get(char1);
                    
                }
                map1.put(char1, ++charcount);

                charcount=0;

                char char2=s2.charAt(i);

                if (map1.containsKey(char2)) 
                {
                    charcount=map1.get(char2);
                    
                }
                map1.put(char2, --charcount);


            }

            for (int val : map1.values()) {
                if (val!=0)
                    status=false;              
                }
        
        if (status) 
            return true;
    
        else
            return false;

}
    
    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println(checkAnagrams("keep","peek"));
     
    }
}
