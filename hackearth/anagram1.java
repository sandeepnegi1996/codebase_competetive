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
        int n=s.nextInt();
        String s1="";
        String s2="";
        while(n-->0)
        {
            int count=0;
            s1=s.next();
            s2=s.next();
            
            int l1=s1.length();
            int l2=s2.length();
            

            int tl=l1+l2;
            for (int i = 0; i < l1; i++) {

              char c=s1.charAt(i);

              for (int j = 0; j < l2; j++) {
                    if (c==s2.charAt(j)) {
                        count=count+2;
                        
                    }  

              }

            }
            System.out.println(tl-count);
            


        }
	} 
} 
