//implementation based
//hackerearth insert element array


// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
public class TestClass 
{ 
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		int q = s.nextInt(); 
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();

        int queryType;
        int X;
        int Y;
        int sum;
        
		while (q-- > 0) 
		{ 
            sum=0;
            queryType=0;
            queryType=s.nextInt();
            X=s.nextInt();
            Y=s.nextInt();
            if(queryType==1)
            {
              a[X]=Y;
            }
            else{

                if(X<0 || X>n-1 || Y<0 || Y>n-1)
                {
                    System.out.println(-1);
                }
                else{
                    for(int i=X;i<=Y;i++)
                    {
                        sum+=a[i];
                    }
                }
                System.out.print(sum);

                
            }
		} 
	
	} 
} 
