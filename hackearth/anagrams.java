//anagrams using Arrays sort and Arrays equals method

import java.util.*;

class TestClass
{
    public static boolean checkAnagrams(String s1,String s2)
    {
        //remove the spaces from the string 
        String s1copy=s1.replaceAll("\\s","");
        String s2copy=s2.replaceAll("\\s","");

       // System.out.println(s1copy);
       // System.out.println(s2copy);

        int l1=s1copy.length();
        int l2=s2copy.length();

       // System.out.println(l1);
        
       // System.out.println(l2);
        boolean status=false;
        if (l1!=l2) {
            status =false;

        }
        else{
            
         //   System.out.println("inside else");
            char[] s1arr=s1copy.toLowerCase().toCharArray();
            char[] s2arr=s2copy.toLowerCase().toCharArray();

            Arrays.sort(s1arr);
            Arrays.sort(s2arr);
            
            status=Arrays.equals(s1arr, s2arr);


        }
        if (status) {
            return true;           
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println(checkAnagrams("keep","peek"));
    }
}