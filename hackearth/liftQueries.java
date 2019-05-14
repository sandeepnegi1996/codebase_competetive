//implementation based
//hackerearth insert element array


// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner; 
 class TestClass 
{ 
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
      //  System.out.println("testing");
        int A=1;
        int B=7;
        int Targetfloor=0;
		while (n-- > 0) 
		{
        //    System.out.println("inside the while");
            Targetfloor=s.nextInt();

            if (Math.abs(A-Targetfloor) < Math.abs(B-Targetfloor)) {
                System.out.println("A");
                A=Targetfloor;
                
            }
            else if(Math.abs(A-Targetfloor) > Math.abs(B-Targetfloor)){
                System.out.println("B");
                B=Targetfloor;
            }
            else if (Math.abs(A-Targetfloor) == Math.abs(B-Targetfloor)) {
                if (A<B) {
                    System.out.println("A");
                    A=Targetfloor;
                    
                }
                else{
                    System.out.println("B");
                    B=Targetfloor;
                    
                }
            }
		} 
	
	} 
} 
