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
        int n = s.nextInt(); 
        
        for (int j = 2; j <=n; j++) {
            
        int num=j;
        boolean flag=false;
        for (int i = 2; i <=num/2; i++) {

            if (num%i==0) {
                flag=true;
                break;
            }    
        }
        if (!flag) {
           System.out.print(j+"  ");
        }
        
    }
	} 
} 
