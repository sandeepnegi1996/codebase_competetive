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
        int n=2000;
        String str="";
        int count=0;
        str=s.nextLine()
        while (str.length()>0) 
        {
            
            char []arr=str.toCharArray();
            

            for (int i = 0; i< arr.length; i++) 
            {
                if (arr[i]=='/' && arr[i+1]=='/')
                 {
                    break;    
                }
                else if (arr[i]=='-' && arr[i+1]=='>')
                 {
                    arr[i]='.';
                    for (int j = i+1; j < arr.length-1; j++) 
                    {
                        arr[j]=arr[j+1];    
                    }
                }    
            }
            String streplace=new String(arr);
            System.out.println(streplace);

            
        }
        
    }
}