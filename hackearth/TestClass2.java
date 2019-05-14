//implementation based
//hackerearth insert element array


// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner; 
public class TestClass2
{ 
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in); 
        int n = s.nextInt(); 

        String arr[]=new String[4];

        while(n-->0)
        {
            for (int i = 0; i < 4; i++)
            {
                arr[i]=s.nextLine();
            }
            String s1="x.x";
            String s2="xx.";
            
            boolean flag=false;
            
            for (int i = 0; i <4; i++)
            {
                if(arr[i].contains(s1)|| arr[i].contains(s2))
                        flag=true;
                
            }

            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            
            
        }
	
	} 
} 
