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
        int totalBricks=s.nextInt();

        int patlu=0;
        int motu=0;
        int total=totalBricks;
        boolean p =false;
        boolean m = false;
        int diff=0;
        for(int i=1;i<=totalBricks;i++)
        {
            patlu=i;
            motu=2*i;
            int total1=patlu+motu;
            diff=total-total1;
            if(diff-patlu<0)
            {
                p=true;
                break;
            }
            if(diff-motu<0)
            {
                m=true;
                break;
            }
            
            
        }
        if(m)
            System.out.println("Motu");
        else
            System.out.println("Patlu");


	} 
} 
