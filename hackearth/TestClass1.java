//implementation based
//hackerearth insert element array


// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner; 
public class TestClass1 
{ 
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in); 
        int n = s.nextInt(); 
        
        BigInteger[] arr=  new  BigInteger[n];

        for(int i=0;i<n;i++)
            arr[i]=s.nextBigInteger();
        
        BigInteger sum=BigInteger.valueOf(0);

        for(int i=0;i<n;i++)
            sum=sum.add(arr[i]);

        System.out.println(sum);
            

	
	} 
} 
