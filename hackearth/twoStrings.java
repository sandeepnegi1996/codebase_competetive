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
        String s1="";
        String s2="";
        boolean status=true;
        
		while (n-- > 0) 
		{
            status=true;
            
            s1=s.next();
            s2=s.next();
            
            int count=0;
            HashMap<Character,Integer> map=new HashMap<Character,Integer>();

            for(int i=0;i<s1.length();i++)
            {
                count=0;
                char char1=s1.charAt(i);
                if (map.containsKey(char1)) {
                    count=map.get(char1);
                }
                map.put(char1, ++count);

                count=0;

                 char1=s2.charAt(i);
                if (map.containsKey(char1)) {
                    count=map.get(char1);
                }
                map.put(char1, --count);

            }
            for (int value : map.values()) {
                    if (value!=0) {
                        status=false;                  
                    }
            }
            if (status) {
                System.out.println("YES");
                
            }
            else{
                System.out.println("NO");
            }     
            
		} 
	
	} 
} 
