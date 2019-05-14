//implementation based
//hackerearth insert element array


// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6; 
 class TestClass 
{ 
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in); 
        String mazeString=s.next();
        int x=0;
        int y=0;

        for (int i = 0; i < mazeString.length(); i++) 
        {
            if (mazeString.charAt(i)=='L')
                x-=1;   
            else if(mazeString.charAt(i)=='R')
                x+=1;
            else if(mazeString.charAt(i)=='D')
                y-=1;
            else 
                y+=1;
            
        }
        System.out.println(x+" "+y);
    
	} 
} 
