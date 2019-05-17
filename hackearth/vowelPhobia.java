import java.util.*;


//for System.out.println();

//type sysout
//sysout
class TestClass
{
    public static void main(String[] args) {
    //  System.out.println("hello wold");
     //   System.out.println("using sysout");

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str="";
        int count=0;
        while (n-->0) 
        {
            str=s.next();
            count=0;
            for (int i = 0; i< str.length() ; i++) 
            {
                if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                    count++;    
            }
            System.out.println(count);
        }
        
    }
}