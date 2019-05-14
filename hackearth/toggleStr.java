//implementation based
//hackerearth insert element array


// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner; 
 class TestClass 
{ 
	public static void main(String[] args) 
	{ 
        Scanner s = new Scanner(System.in); 
        String s1=s.next();
        char[] s1arr=s1.toCharArray();

        for (int i = 0; i < s1.length(); i++) 
        {
            char changes;
            if (Character.isUpperCase(s1.charAt(i))) {

               changes= Character.toLowerCase(s1.charAt(i));
                
            }
            else{
                   changes= Character.toUpperCase(s1.charAt(i));  
            }
            s1arr[i]=changes;

        }
        for (char var : s1arr) {
            System.out.print(var);
            
        }
        
	} 
} 
