import java.util.*;


class TestClass
{
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner s=new Scanner(System.in);
        
        String str=s.next();
        char x=str.charAt(0);
        char []strarr=str.toCharArray();

        int countrepetition=0;
        StringBuffer compressedStr=new StringBuffer(Character.toString(x));
        for (int i = 0; i< strarr.length; i++)
         {

            if(x==strarr[i])
            {
                countrepetition++;
                   
            }
            else{
                //forma new string 
                compressedStr.append(countrepetition+"");
                
                
                countrepetition=1;
                x=strarr[i];
                compressedStr.append(Character.toString(x));
            }
            
            
        }
        System.out.println(compressedStr);
    }
}