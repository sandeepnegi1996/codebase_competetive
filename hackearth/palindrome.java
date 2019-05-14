import java.util.*;

class TestClass
{
    public static void main(String[] args) {
       // System.out.println("hello world");

       String str="mamer";

       String reverse=new StringBuffer(str).reverse().toString();
       if (str.equals(reverse))
        {
           System.out.print("YES");
       }
    }
}