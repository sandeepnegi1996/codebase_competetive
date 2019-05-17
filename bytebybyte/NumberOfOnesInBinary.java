import java.util.*;

class TestClass
{
    public static String convertToBinary(int n)
    {
        StringBuffer str=new StringBuffer("");
        int modlus=0;
        while (n>0) 
        {
            modlus=n%2;
            str.append(Integer.toString(modlus));
            n=n/2;
        }
        System.out.println("without reverse the binary string is "+str);
        str.reverse();

        return str.toString();
    }
    public int maxZeroes(String binary)
    {
        
        return 0;
    }

    public int numberOfones(String binary)
    {
        while (num>0) 
        {
            
            num=num&(num-1);    
        }
        return 0;
    }
    public static void main(String[] args) {
        //System.out.println("hello world");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n);

        String binary=convertToBinary(n);
        System.out.println("binary string "+binary);
    }
}