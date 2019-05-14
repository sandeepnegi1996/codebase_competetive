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
    static void isAnagram(String s1, String s2)
    {
        //Removing white spaces from s1 and s2 and converting case to lower case
 
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
 
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Constructing a map containing character as a key and character occurrences as a value
 
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
            for (int i = 0; i < copyOfs1.length(); i++)
            {
                //Getting char from copyOfs1
 
                char charAsKey = copyOfs1.charAt(i);
 
                //Initializing char count to 0
 
                int charCountAsValue = 0;
 
                //Checking whether map contains this char
 
                if(map.containsKey(charAsKey))
                {
                    //If contains, retrieving it's count
 
                    charCountAsValue = map.get(charAsKey);
                }
 
                //Putting char and it's count to map with pre-incrementing char count
 
                map.put(charAsKey, ++charCountAsValue);
 
                //Getting char from copyOfs2
 
                charAsKey = copyOfs2.charAt(i);
 
                //Initializing char count to 0
 
                charCountAsValue = 0;
 
                //Checking whether map contains this char
 
                if(map.containsKey(charAsKey))
                {
                    //If contains, retrieving it's count
 
                    charCountAsValue = map.get(charAsKey);
                }
 
                //Putting char and it's count to map with pre-decrementing char count
 
                map.put(charAsKey, --charCountAsValue);
            }
 
            //Checking each character and it's count
 
            for (int value : map.values())
            {
                if(value != 0)
                {
                    //If character count is not equal to 0, then setting status as false
 
                    status = false;
                }
            }
 
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println(checkAnagrams("keep","peek"));
     //  isAnagram("keep","peek");
    }
}