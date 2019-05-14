//implementation based
//hackerearth insert element array


// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner; 
 class TestClass 
{ 
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in); 
        int num = s.nextInt(); 

        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact*=i;
            
        }
        System.out.println(fact);
        
        
    
	} 
} 
